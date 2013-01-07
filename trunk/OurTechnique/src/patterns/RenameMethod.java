package patterns;

import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.ModifierSet;
import japa.parser.ast.body.TypeDeclaration;
import java.util.ArrayList;
import java.util.HashSet;

import util.OurMethodDeclaration;

public class RenameMethod extends Common {

	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String className, String methodName, String newName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeDeclaration classObj = getType(comps, className);
		MethodDeclaration meth = getMethod(classObj, methodName);
		MethodDeclaration newMeth = getMethod(classObj, newName);
		impactedMethods.add(new OurMethodDeclaration(meth.getName(), meth.getParameters()));
		
		if (meth != null)
			impactedMethods.addAll(caller(classObj, meth));
		if (newMeth != null)
			impactedMethods.addAll(caller(classObj, newMeth));
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classObj);
		for (TypeDeclaration sub : subClasses) {
			impactedMethods.addAll(caller(sub, meth));
			impactedMethods.addAll(caller(sub, newName));
		}
		
		ArrayList<TypeDeclaration> superClasses = getSuperClasses(classes, classObj);
		for (TypeDeclaration superC : superClasses) {
			MethodDeclaration m = getMethod(superC, methodName);
			if (m != null)
				impactedMethods.add(new OurMethodDeclaration(m.getName(), m.getParameters()));
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
