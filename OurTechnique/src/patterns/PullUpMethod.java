package patterns;

import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.ModifierSet;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.stmt.Statement;

import java.util.ArrayList;
import java.util.HashSet;

import util.OurMethodDeclaration;

public class PullUpMethod extends Common{

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
			impactedMethods.addAll(caller(classTarget, meth));
		}else {
			impactedMethods.addAll(caller(classOrig, methName));
			impactedMethods.addAll(caller(classTarget, methName));
		}
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classTarget);
		for (TypeDeclaration sub : subClasses) {
			impactedMethods.addAll(caller(sub, meth));
		}
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeDeclaration c : classes) {
				impactedMethods.addAll(caller(c, meth));
			}
		}
		
		write2(impactedMethods);	
		return impactedMethods;
	}

}
