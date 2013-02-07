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

	public static ArrayList<String> getImpactedMethods(ArrayList<CompilationUnit> comps, String className, 
			String methodSig) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeObj typeObj = getType(comps, className);
		TypeDeclaration classObj = typeObj.getType();
		String packageStr = "_"+typeObj.getPackageD().getName()+"."+classObj.getName();
		
		MethodDeclaration meth = getMethod(classObj, methodSig);
		
		impactedMethods.add(new OurMethodDeclaration(meth.getName()+packageStr, meth.getParameters()));
		impactedMethods.addAll(caller(classObj, meth, packageStr));
		
		ArrayList<TypeObj> classes = allclasses(comps);
		ArrayList<TypeObj> subClasses = getSubClasses(classes, classObj);
		for (TypeObj sub : subClasses) {
			TypeObj subObj = getType(comps, sub.getType().getName());
			packageStr = "_"+subObj.getPackageD().getName()+"."+subObj.getType().getName();
			impactedMethods.addAll(caller(sub.getType(), meth, packageStr));
		}
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeObj c : classes) {
				TypeObj cObj = getType(comps, c.getType().getName());
				if (cObj != null){
					packageStr = "_"+cObj.getPackageD().getName()+"."+cObj.getType().getName();
					impactedMethods.addAll(caller(c.getType(), meth, packageStr));
				}
			}
		}
		impactedMethods = excludeRepetitions(impactedMethods);
		return affectedToString(impactedMethods);
	}
}
