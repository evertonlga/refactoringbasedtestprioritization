package patterns;

import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.ModifierSet;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.stmt.Statement;

import java.util.ArrayList;
import java.util.HashSet;

import util.OurMethodDeclaration;

public class ExtractMethod extends Common {

	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String className, 
			String origMethodName, String newMethName, int beginLine, int endLine) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeDeclaration classObj = getType(comps, className);
		MethodDeclaration meth = getMethod(classObj, origMethodName);
		MethodDeclaration newMeth = getMethod(classObj, newMethName);
		
		impactedMethods.add(new OurMethodDeclaration(meth.getName(), meth.getParameters()));
		if (newMeth != null)
			impactedMethods.add(new OurMethodDeclaration(newMeth.getName(), newMeth.getParameters()));
		
		if (meth != null)
			impactedMethods.addAll(caller(classObj, meth));
		else impactedMethods.addAll(caller(classObj, origMethodName));
		if (newMeth != null)
			impactedMethods.addAll(caller(classObj, newMeth));
		else impactedMethods.addAll(caller(classObj, newMethName));
		
		ArrayList<Statement> stms = getStatements(meth, beginLine, endLine);
		impactedMethods.addAll(fieldAnalysis(classObj, stms));
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classObj);
		for (TypeDeclaration sub : subClasses) {
			impactedMethods.addAll(caller(sub, meth));
			impactedMethods.addAll(fieldAnalysis(sub, stms));
			impactedMethods.addAll(caller(sub, newMeth));
		}
		
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeDeclaration c : classes) {
				impactedMethods.addAll(caller(c, meth));
			}
		}
		
		if (newMeth!= null && ModifierSet.isStatic(newMeth.getModifiers())){
			for (TypeDeclaration c : classes) {
				impactedMethods.addAll(caller(c, newMeth));
			}
		}
			
		write2(impactedMethods);
		return impactedMethods;		
	}

}
