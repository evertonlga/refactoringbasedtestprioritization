package patterns;

import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.ModifierSet;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.stmt.Statement;

import java.util.ArrayList;
import java.util.HashSet;

import util.OurMethodDeclaration;

public class AddParameter extends Common{

	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String className, 
			String methodName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeDeclaration classObj = getType(comps, className);
		MethodDeclaration meth = getMethod(classObj, methodName);
				
		impactedMethods.add(new OurMethodDeclaration(meth.getName(), meth.getParameters()));
		impactedMethods.addAll(caller(classObj, meth));
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classObj);
		for (TypeDeclaration sub : subClasses) {
			impactedMethods.addAll(caller(sub, meth));
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
