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

public class PullUpMethod extends Common{

	public static ArrayList<String> getImpactedMethods(ArrayList<CompilationUnit> comps, String classOneName, 
			String classTwoName, String methName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeObj typeObjOne = getType(comps, classOneName);
		TypeDeclaration classOrig = typeObjOne.getType();
		String packageStr1 = "*"+typeObjOne.getPackageD().getName()+"."+classOrig.getName();
		
		TypeObj typeObjTwo = getType(comps, classTwoName);
		TypeDeclaration classTarget = typeObjTwo.getType();
		String packageStr2 = "*"+typeObjTwo.getPackageD().getName()+"."+classTarget.getName();
		
		MethodDeclaration meth = getMethod(classOrig, methName);
		MethodDeclaration newMeth = getMethod(classTarget, methName);
		
		impactedMethods.add(new OurMethodDeclaration(meth.getName()+packageStr1, meth.getParameters()));
		if (newMeth != null)
			impactedMethods.add(new OurMethodDeclaration(newMeth.getName()+packageStr2, newMeth.getParameters()));
		
		if (meth != null){
			impactedMethods.addAll(caller(classOrig, meth, packageStr1));
			impactedMethods.addAll(caller(classTarget, meth, packageStr2));
		}else {
			impactedMethods.addAll(caller(classOrig, methName, packageStr1));
			impactedMethods.addAll(caller(classTarget, methName, packageStr2));
		}
		
		ArrayList<TypeObj> classes = allclasses(comps);
		ArrayList<TypeObj> subClasses = getSubClasses(classes, classTarget);
		for (TypeObj sub : subClasses) {
			TypeObj cObj = getType(comps, sub.toString());
			String packageStr = "*"+cObj.getPackageD().getName()+"."+cObj.getType().getName();
			
			ArrayList<MethodDeclaration> sameNameMeths = findMethodsByName(cObj.getType(), methName);
			for (MethodDeclaration m : sameNameMeths) {
				OurMethodDeclaration omd = new OurMethodDeclaration(m.getName()+packageStr, m.getParameters());
				impactedMethods.add(omd);
			}
			
			impactedMethods.addAll(caller(sub.getType(), meth, packageStr));
		}
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeObj c : classes) {
				TypeObj cObj = getType(comps, c.toString());
				String packageStr = "*"+cObj.getPackageD().getName()+"."+cObj.getType().getName();
				
				impactedMethods.addAll(caller(c.getType(), meth, packageStr));
			}
		}
		
		impactedMethods = excludeRepetitions(impactedMethods);
		return affectedToString(impactedMethods);
	}

}
