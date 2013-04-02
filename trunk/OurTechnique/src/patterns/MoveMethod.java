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

public class MoveMethod extends Common {

	public static ArrayList<String> getImpactedMethods(ArrayList<CompilationUnit> comps, String classOneName, 
			String classTwoName, String methName) {
		HashSet<OurMethodDeclaration> impactedMethods = new HashSet<OurMethodDeclaration>();
		
		TypeObj typeObjOne = getType(comps, classOneName);
		TypeDeclaration classOrig = typeObjOne.getType();
		String packageStr1 = "*"+typeObjOne.getPackageD().getName()+"."+classOrig.getName();		
		MethodDeclaration meth = getMethod(classOrig, methName);
		
		TypeObj typeObjTwo = getType(comps, classTwoName);
		TypeDeclaration classTarget = typeObjTwo.getType();
		String packageStr2 = "*"+typeObjTwo.getPackageD().getName()+"."+classTarget.getName();;
		MethodDeclaration newMeth = getMethod(classTarget, methName);
		
		impactedMethods.add(new OurMethodDeclaration(meth.getName()+packageStr1, meth.getParameters()));
		
		if (methName.contains("(")){
			int index = methName.indexOf("(");
			String simpleMethName = methName.substring(0, index);
			ArrayList<MethodDeclaration> meths = findMethodsByName(classOrig, simpleMethName);
			for (MethodDeclaration m : meths) {
				impactedMethods.add(new OurMethodDeclaration(m.getName()+packageStr1, m.getParameters()));
			}
		}
		
		if (newMeth != null)
			impactedMethods.add(new OurMethodDeclaration(newMeth.getName()+packageStr2, newMeth.getParameters()));
		
		if (meth != null){
			impactedMethods.addAll(caller(classOrig, meth, packageStr1));
			impactedMethods.addAll(fieldAnalysis(meth, classOrig, new ArrayList<Statement>(meth.getBody().getStmts()), packageStr1));
		}else {
			impactedMethods.addAll(caller(classOrig, methName, packageStr1));
			impactedMethods.addAll(fieldAnalysis(meth, classOrig, new ArrayList<Statement>(meth.getBody().getStmts()), packageStr1));
		}
		
		if (newMeth != null){
			impactedMethods.addAll(caller(classTarget, newMeth, packageStr2));
			impactedMethods.addAll(fieldAnalysis(newMeth, classTarget, new ArrayList<Statement>(meth.getBody().getStmts()), packageStr2));
		}else{
			impactedMethods.addAll(caller(classTarget, methName, packageStr2));
			impactedMethods.addAll(fieldAnalysis(newMeth, classTarget, new ArrayList<Statement>(meth.getBody().getStmts()), packageStr2));
		}
		
		ArrayList<TypeObj> classes = allclasses(comps);
		ArrayList<TypeObj> subClasses = getSubClasses(classes, classOrig);
		for (TypeObj sub : subClasses) {
			TypeObj cObj = getType(comps, sub.toString());
			String packageStr = "*"+cObj.getPackageD().getName()+"."+cObj.getType().getName();
			
			impactedMethods.addAll(caller(sub.getType(), meth, packageStr));
			impactedMethods.addAll(fieldAnalysis(meth, sub.getType(), new ArrayList<Statement>(meth.getBody().getStmts()),packageStr));
		}
		
		subClasses = getSubClasses(classes, classTarget);
		for (TypeObj sub : subClasses) {
			TypeObj cObj = getType(comps, sub.toString());
			String packageStr = "*"+cObj.getPackageD().getName()+"."+cObj.getType().getName();
			
			impactedMethods.addAll(caller(sub.getType(), meth, packageStr));
			impactedMethods.addAll(fieldAnalysis(meth, sub.getType(), new ArrayList<Statement>(meth.getBody().getStmts()), packageStr));
		}
		
		ArrayList<TypeObj> superClassesOr = getSuperClasses(classes, classOrig);
		for (TypeObj superC : superClassesOr) {
			TypeObj cObj = getType(comps, superC.toString());
			String packStr = "*"+cObj.getPackageD().getName()+"."+cObj.getType().getName();
			
			MethodDeclaration m = getMethod(superC.getType(), methName);
			if (m != null)
				impactedMethods.add(new OurMethodDeclaration(m.getName()+packStr, m.getParameters()));
			impactedMethods.addAll(caller(superC.getType(), meth, packStr));
		}
		
		ArrayList<TypeObj> superClassesTar = getSuperClasses(classes, classTarget);
		for (TypeObj superC : superClassesTar) {
			TypeObj cObj = getType(comps, superC.toString());
			String packStr = "*"+cObj.getPackageD().getName()+"."+cObj.getType().getName();
			
			MethodDeclaration m = getMethod(superC.getType(), methName);
			if (m != null)
				impactedMethods.add(new OurMethodDeclaration(m.getName()+packStr, m.getParameters()));
		}
		
		if (ModifierSet.isStatic(meth.getModifiers())){
			for (TypeObj c : classes) {
				TypeObj cObj = getType(comps, c.toString());
				String packageStr = "*"+cObj.getPackageD().getName()+"."+cObj.getType().getName();
				
				impactedMethods.addAll(caller(c.getType(), meth, packageStr));
				impactedMethods.addAll(fieldAnalysis(meth, c.getType(), new ArrayList<Statement>(meth.getBody().getStmts()), packageStr));
			}
		}
		
		impactedMethods = excludeRepetitions(impactedMethods);
		return affectedToString(impactedMethods);
	}

}
