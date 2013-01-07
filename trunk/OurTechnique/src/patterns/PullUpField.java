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
	
	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String classOneName, 
			String classTwoName, String fieldName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeObj typeObjOne = getType(comps, classOneName);
		TypeDeclaration classOrig = typeObjOne.getType();
		String packageStr1 = "_"+typeObjOne.getPackageD().getName();
		
		TypeObj typeObjTwo = getType(comps, classTwoName);
		TypeDeclaration classTarget = typeObjOne.getType();
		String packageStr2 = "_"+typeObjTwo.getPackageD().getName();
			
		ArrayList<OurMethodDeclaration> impactedFromOrig = getMethodThatAccessField(classOrig, fieldName, packageStr1);
		impactedMethods.addAll(impactedFromOrig);
		impactedMethods.addAll(getMethodThatAccessField(classTarget, fieldName, packageStr2));
		
		for (OurMethodDeclaration ourMethodDeclaration : impactedFromOrig) {
			MethodDeclaration m = getMethod(classTarget, ourMethodDeclaration.getName());
			if (m != null)
				impactedMethods.add(new OurMethodDeclaration(m.getName(), m.getParameters()));
		}
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classTarget);
		for (TypeDeclaration sub : subClasses) {
			TypeObj cObj = getType(comps, sub.getName());
			String packageStr = "_"+cObj.getPackageD().getName();
			
			impactedMethods.addAll(getMethodThatAccessField(sub, fieldName, packageStr));
			
			for (OurMethodDeclaration ourMethodDeclaration : impactedFromOrig) {
				MethodDeclaration m = getMethod(classTarget, ourMethodDeclaration.getName());
				if (m != null)
					impactedMethods.add(new OurMethodDeclaration(m.getName(), m.getParameters()));
			}
		}
			
		write2(impactedMethods);
		return impactedMethods;		
	}

}
