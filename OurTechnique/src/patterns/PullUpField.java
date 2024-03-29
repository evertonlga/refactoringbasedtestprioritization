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

public class PullUpField extends Common{

	//Posso subir o field para uma classe acima da superior???

	public static ArrayList<String> getImpactedMethods(ArrayList<CompilationUnit> comps, String classOneName, 
			String classTwoName, String fieldName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();

		TypeObj typeObjOne = getType(comps, classOneName);
		TypeDeclaration classOrig = typeObjOne.getType();
		String packageStr1 = "*"+typeObjOne.getPackageD().getName()+"."+classOrig.getName();

		TypeObj typeObjTwo = getType(comps, classTwoName);
		TypeDeclaration classTarget = typeObjTwo.getType();
		String packageStr2 = "*"+typeObjTwo.getPackageD().getName()+"."+classTarget.getName();

		ArrayList<OurMethodDeclaration> impactedFromOrig = getMethodThatAccessField(classOrig, fieldName, packageStr1);
		impactedMethods.addAll(impactedFromOrig);
		impactedMethods.addAll(getMethodThatAccessField(classTarget, fieldName, packageStr2));

		for (OurMethodDeclaration ourMethodDeclaration : impactedFromOrig) {
			MethodDeclaration m = getMethod(classTarget, ourMethodDeclaration.toString());
			if (m != null)
				impactedMethods.add(new OurMethodDeclaration(m.getName(), m.getParameters()));
		}

		ArrayList<TypeObj> classes = allclasses(comps);
		ArrayList<TypeObj> subClasses = getSubClasses(classes, classTarget);
		for (TypeObj sub : subClasses) {
			TypeObj cObj = getType(comps, sub.toString());
			String packageStr = "*"+cObj.getPackageD().getName()+"."+cObj.getType().getName();

			impactedMethods.addAll(getMethodThatAccessField(sub.getType(), fieldName, packageStr));

			for (OurMethodDeclaration ourMethodDeclaration : impactedFromOrig) {
				MethodDeclaration m = getMethod(classTarget, ourMethodDeclaration.toString());
				if (m != null)
					impactedMethods.add(new OurMethodDeclaration(m.getName(), m.getParameters()));
			}
		}

		impactedMethods = excludeRepetitions(impactedMethods);
		return affectedToString(impactedMethods);	
	}

}
