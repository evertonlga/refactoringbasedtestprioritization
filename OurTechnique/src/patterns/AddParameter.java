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
		String packageStr = "*"+typeObj.getPackageD().getName()+"."+classObj.getName();
		
		MethodDeclaration meth = getMethod(classObj, methodSig);
		if (methodSig.contains("(")){
			int index = methodSig.indexOf("(");
			String simpleMethName = methodSig.substring(0, index);
			ArrayList<MethodDeclaration> meths = findMethodsByName(classObj, simpleMethName);
			for (MethodDeclaration m : meths) {
				impactedMethods.add(new OurMethodDeclaration(m.getName()+packageStr, m.getParameters()));
			}
		}
			
		OurMethodDeclaration omd = new OurMethodDeclaration(meth.getName()+packageStr, meth.getParameters());
		impactedMethods.add(omd);
		
		
		impactedMethods.addAll(caller(classObj, meth, packageStr));
		
		ArrayList<TypeObj> classes = allclasses(comps);
		ArrayList<TypeObj> subClasses = getSubClasses(classes, classObj);
		for (TypeObj sub : subClasses) {
			TypeObj subObj = getType(comps, sub.toString());
			packageStr = "*"+subObj.getPackageD().getName()+"."+subObj.getType().getName();
			impactedMethods.addAll(caller(sub.getType(), meth, packageStr));
		}
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeObj c : classes) {
				TypeObj cObj = getType(comps, c.toString());
				if (cObj != null){
					packageStr = "*"+cObj.getPackageD().getName()+"."+cObj.getType().getName();
					impactedMethods.addAll(caller(c.getType(), meth, packageStr));
				}
			}
		}
		impactedMethods = excludeRepetitions(impactedMethods);
		return affectedToString(impactedMethods);
	}
}
