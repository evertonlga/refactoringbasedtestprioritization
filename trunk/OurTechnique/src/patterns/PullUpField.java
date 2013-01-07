package patterns;

import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.ModifierSet;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.stmt.Statement;

import java.util.ArrayList;
import java.util.HashSet;

import util.OurMethodDeclaration;

public class PullUpField extends Common{
	
	//Posso subir o field para uma classe acima da superior???
	
	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String classOneName, 
			String classTwoName, String fieldName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeDeclaration classOrig = getType(comps, classOneName);
		TypeDeclaration classTarget = getType(comps, classTwoName);
		
		ArrayList<OurMethodDeclaration> impactedFromOrig = getMethodThatAccessField(classOrig, fieldName);
		impactedMethods.addAll(impactedFromOrig);
		impactedMethods.addAll(getMethodThatAccessField(classTarget, fieldName));
		
		for (OurMethodDeclaration ourMethodDeclaration : impactedFromOrig) {
			MethodDeclaration m = getMethod(classTarget, ourMethodDeclaration.getName());
			if (m != null)
				impactedMethods.add(new OurMethodDeclaration(m.getName(), m.getParameters()));
		}
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classTarget);
		for (TypeDeclaration sub : subClasses) {
			impactedMethods.addAll(getMethodThatAccessField(sub, fieldName));
			
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
