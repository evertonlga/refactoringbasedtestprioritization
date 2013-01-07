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

	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String classOneName, 
			String classTwoName, String methName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeObj typeObjOne = getType(comps, classOneName);
		TypeDeclaration classOrig = typeObjOne.getType();
		String packageStr1 = "_"+typeObjOne.getPackageD().getName();
		
		TypeObj typeObjTwo = getType(comps, classTwoName);
		TypeDeclaration classTarget = typeObjTwo.getType();
		String packageStr2 = "_"+typeObjTwo.getPackageD().getName();
		
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
			String packageStr = "_"+cObj.getPackageD().getName();
			
			impactedMethods.addAll(caller(sub.getType(), meth, packageStr));
		}
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeObj c : classes) {
				TypeObj cObj = getType(comps, c.toString());
				String packageStr = "_"+cObj.getPackageD().getName();
				
				impactedMethods.addAll(caller(c.getType(), meth, packageStr));
			}
		}
		
		write2(impactedMethods);	
		return impactedMethods;
	}

}