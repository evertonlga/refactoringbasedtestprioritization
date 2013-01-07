package patterns;

import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.ModifierSet;
import japa.parser.ast.body.TypeDeclaration;
import java.util.ArrayList;
import java.util.HashSet;

import util.OurMethodDeclaration;
import util.TypeObj;

public class RenameMethod extends Common {

	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String className, String methodName, String newName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeObj typeObj = getType(comps, className);
		TypeDeclaration classObj = typeObj.getType();
		String packageStr = "_"+typeObj.getPackageD().getName();
		
		MethodDeclaration meth = getMethod(classObj, methodName);
		MethodDeclaration newMeth = getMethod(classObj, newName);
		impactedMethods.add(new OurMethodDeclaration(meth.getName()+packageStr, meth.getParameters()));
		
		if (meth != null)
			impactedMethods.addAll(caller(classObj, meth, packageStr));
		if (newMeth != null)
			impactedMethods.addAll(caller(classObj, newMeth, packageStr));
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classObj);
		for (TypeDeclaration sub : subClasses) {
			TypeObj cObj = getType(comps, sub.getName());
			String packStr = "_"+cObj.getPackageD().getName();
			
			impactedMethods.addAll(caller(sub, meth, packStr));
			impactedMethods.addAll(caller(sub, newName, packStr));
		}
		
		ArrayList<TypeDeclaration> superClasses = getSuperClasses(classes, classObj);
		for (TypeDeclaration superC : superClasses) {
			TypeObj cObj = getType(comps, superC.getName());
			String packStr = "_"+cObj.getPackageD().getName();
			
			MethodDeclaration m = getMethod(superC, methodName);
			if (m != null)
				impactedMethods.add(new OurMethodDeclaration(m.getName()+packageStr, m.getParameters()));
		}
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeDeclaration c : classes) {
				TypeObj cObj = getType(comps, c.getName());
				String packStr = "_"+cObj.getPackageD().getName();
				
				impactedMethods.addAll(caller(c, meth, packStr));
			}
		}
			
		write2(impactedMethods);
		return impactedMethods;		
	}


}
