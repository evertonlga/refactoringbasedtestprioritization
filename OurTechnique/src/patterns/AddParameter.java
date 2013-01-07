package patterns;

import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.ModifierSet;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.stmt.Statement;

import java.util.ArrayList;
import java.util.HashSet;

import util.OurMethodDeclaration;
import util.TypeObj;

public class AddParameter extends Common{

	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String className, 
			String methodName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeObj typeObj = getType(comps, className);
		TypeDeclaration classObj = typeObj.getType();
		String packageStr = "_"+typeObj.getPackageD().getName();
		
		MethodDeclaration meth = getMethod(classObj, methodName);
		
		impactedMethods.add(new OurMethodDeclaration(meth.getName()+packageStr, meth.getParameters()));
		impactedMethods.addAll(caller(classObj, meth, packageStr));
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classObj);
		for (TypeDeclaration sub : subClasses) {
			TypeObj subObj = getType(comps, sub.getName());
			packageStr = "_"+subObj.getPackageD().getName();
			impactedMethods.addAll(caller(sub, meth, packageStr));
		}
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeDeclaration c : classes) {
				TypeObj cObj = getType(comps, c.getName());
				packageStr = "_"+cObj.getPackageD().getName();
				impactedMethods.addAll(caller(c, meth, packageStr));
			}
		}
		
		write2(impactedMethods);	
		return impactedMethods;
	}
}
