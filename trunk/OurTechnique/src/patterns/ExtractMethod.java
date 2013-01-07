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

public class ExtractMethod extends Common {

	public static HashSet<OurMethodDeclaration> getImpactedMethods(ArrayList<CompilationUnit> comps, String className, 
			String origMethodName, String newMethName, int beginLine, int endLine) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeObj typeObj = getType(comps, className);
		TypeDeclaration classObj = typeObj.getType();
		String packageStr = "_"+typeObj.getPackageD().getName();
		
		MethodDeclaration meth = getMethod(classObj, origMethodName);
		MethodDeclaration newMeth = getMethod(classObj, newMethName);
		
		impactedMethods.add(new OurMethodDeclaration(meth.getName()+packageStr, meth.getParameters()));
		if (newMeth != null)
			impactedMethods.add(new OurMethodDeclaration(newMeth.getName()+packageStr, newMeth.getParameters()));
		
		if (meth != null)
			impactedMethods.addAll(caller(classObj, meth, packageStr));
		else impactedMethods.addAll(caller(classObj, origMethodName, packageStr));
		if (newMeth != null)
			impactedMethods.addAll(caller(classObj, newMeth, packageStr));
		else impactedMethods.addAll(caller(classObj, newMethName, packageStr));
		
		ArrayList<Statement> stms = getStatements(meth, beginLine, endLine);
		impactedMethods.addAll(fieldAnalysis(classObj, stms, packageStr));
		
		ArrayList<TypeDeclaration> classes = allclasses(comps);
		ArrayList<TypeDeclaration> subClasses = getSubClasses(classes, classObj);
		for (TypeDeclaration sub : subClasses) {
			TypeObj cObj = getType(comps, sub.getName());
			packageStr = "_"+typeObj.getPackageD().getName();
			
			impactedMethods.addAll(caller(sub, meth, packageStr));
			impactedMethods.addAll(fieldAnalysis(sub, stms, packageStr));
			impactedMethods.addAll(caller(sub, newMeth, packageStr));
		}
		
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeDeclaration c : classes) {
				TypeObj cObj = getType(comps, c.getName());
				packageStr = "_"+typeObj.getPackageD().getName();
				
				impactedMethods.addAll(caller(c, meth, packageStr));
			}
		}
		
		if (newMeth!= null && ModifierSet.isStatic(newMeth.getModifiers())){
			for (TypeDeclaration c : classes) {
				TypeObj cObj = getType(comps, c.getName());
				packageStr = "_"+typeObj.getPackageD().getName();
				
				impactedMethods.addAll(caller(c, newMeth, packageStr));
			}
		}
			
		write2(impactedMethods);
		return impactedMethods;		
	}

}
