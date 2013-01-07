package patterns;

import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.ModifierSet;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.stmt.Statement;

import java.util.ArrayList;
import java.util.HashSet;

import util.OurMethodDeclaration;

public class MoveMethod extends Common {

	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String classOneName, 
			String classTwoName, String methName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeDeclaration classOrig = getType(comps, classOneName);
		MethodDeclaration meth = getMethod(classOrig, methName);
		TypeDeclaration classTarget = getType(comps, classTwoName);
		MethodDeclaration newMeth = getMethod(classTarget, methName);
		
		impactedMethods.add(new OurMethodDeclaration(meth.getName(), meth.getParameters()));
		if (newMeth != null)
			impactedMethods.add(new OurMethodDeclaration(newMeth.getName(), newMeth.getParameters()));
		
		if (meth != null){
			impactedMethods.addAll(caller(classOrig, meth));
			impactedMethods.addAll(fieldAnalysis(classOrig, new ArrayList<Statement>(meth.getBody().getStmts())));
		}else {
			impactedMethods.addAll(caller(classOrig, methName));
			impactedMethods.addAll(fieldAnalysis(classOrig, new ArrayList<Statement>(meth.getBody().getStmts())));
		}
		
		if (newMeth != null){
			impactedMethods.addAll(caller(classTarget, newMeth));
			impactedMethods.addAll(fieldAnalysis(classTarget, new ArrayList<Statement>(meth.getBody().getStmts())));
		}else{
			impactedMethods.addAll(caller(classTarget, methName));
			impactedMethods.addAll(fieldAnalysis(classTarget, new ArrayList<Statement>(meth.getBody().getStmts())));
		}
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classOrig);
		for (TypeDeclaration sub : subClasses) {
			impactedMethods.addAll(caller(sub, meth));
			impactedMethods.addAll(fieldAnalysis(sub, new ArrayList<Statement>(meth.getBody().getStmts())));
		}
		
		subClasses = getSubClasses(classes, classTarget);
		for (TypeDeclaration sub : subClasses) {
			impactedMethods.addAll(caller(sub, meth));
			impactedMethods.addAll(fieldAnalysis(sub, new ArrayList<Statement>(meth.getBody().getStmts())));
		}
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeDeclaration c : classes) {
				impactedMethods.addAll(caller(c, meth));
				impactedMethods.addAll(fieldAnalysis(c, new ArrayList<Statement>(meth.getBody().getStmts())));
			}
		}
		
		write2(impactedMethods);	
		return impactedMethods;
	}
}
