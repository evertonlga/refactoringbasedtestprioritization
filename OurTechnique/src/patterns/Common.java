package patterns;

import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.BodyDeclaration;
import japa.parser.ast.body.ClassOrInterfaceDeclaration;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.stmt.Statement;
import japa.parser.ast.type.ClassOrInterfaceType;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.thoughtworks.xstream.XStream;

import util.ExprObj;
import util.OurMethodDeclaration;
import util.SubClassesControler;
import util.TypeObj;

public class Common {

	private static ArrayList<TypeDeclaration> subClasses;
	private static ArrayList<TypeDeclaration> superClasses;

	protected static HashSet<OurMethodDeclaration> caller(TypeDeclaration classObj, MethodDeclaration meth, String packStr) {
		HashSet<OurMethodDeclaration> impacted = new HashSet<>();
		
		List<BodyDeclaration> members = classObj.getMembers();
		for (int i=0; i < members.size(); i++) {
			BodyDeclaration member = members.get(i);
			if (member instanceof MethodDeclaration){
				MethodDeclaration methodD = (MethodDeclaration) member;
				if (isACaller(methodD, meth))
					impacted.add(new OurMethodDeclaration(methodD.getName()+packStr, methodD.getParameters()));
			}
		}
		
		return impacted;
	}
	
	protected static HashSet<OurMethodDeclaration> caller(TypeDeclaration classObj, String methName, String packStr) {
		HashSet<OurMethodDeclaration> impacted = new HashSet<>();
		
		List<BodyDeclaration> members = classObj.getMembers();
		for (int i=0; i < members.size(); i++) {
			BodyDeclaration member = members.get(i);
			if (member instanceof MethodDeclaration){
				MethodDeclaration methodD = (MethodDeclaration) member;
				if (isACaller(methodD, methName))
					impacted.add(new OurMethodDeclaration(methodD.getName()+packStr, methodD.getParameters()));
			}
		}
		
		return impacted;
	}
	
	
	private static boolean isACaller(MethodDeclaration methodD, String methName) {
		if (methodD.getBody().getStmts() != null){
			for (Statement stm : methodD.getBody().getStmts()) {
				if (stm.toString().contains(methName+"(")){
					int index = stm.toString().indexOf(methName+"(");
					if (index > 0 && stm.toString().charAt(index-1) == '.'){
						if (index - 5 > 0){
							String subString = (String) stm.toString().subSequence(index-5, index);
							if (subString.equals("this.")){
//								System.out.println(methodD.getName());
								return true;
							}
						}
					}else{
//						System.out.println(methodD.getName());
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean isACaller(MethodDeclaration methodD,
			MethodDeclaration meth) {
		if (methodD.getBody().getStmts() != null){
			for (Statement stm : methodD.getBody().getStmts()) {
				if (stm.toString().contains(meth.getName()+"(")){
					int index = stm.toString().indexOf(meth.getName()+"(");
					if (index > 0 && stm.toString().charAt(index-1) == '.'){
						if (index - 5 > 0){
							String subString = (String) stm.toString().subSequence(index-5, index);
							if (subString.equals("this.")){
//								System.out.println(methodD.getName());
								return true;
							}
						}
					}else{
//						System.out.println(methodD.getName());
						return true;
					}
				}
			}
		}
		return false;
	}
	
	protected static ArrayList<TypeDeclaration> allclasses(ArrayList<CompilationUnit> comps) {
		ArrayList<TypeDeclaration> classes = new ArrayList<>();
		
		for (CompilationUnit comp : comps) {
			for (TypeDeclaration type : comp.getTypes()) {
				classes.add(type);
			}
		}
		return classes;
	}
	

	private static TypeDeclaration searchClass(
			ArrayList<TypeDeclaration> classes, String classname) {
		for (TypeDeclaration typeDeclaration : classes) {
			if (typeDeclaration.getName().equals(classname))
				return typeDeclaration;
		}
		return null;
	}

	
	protected static ArrayList<TypeDeclaration> getSubClasses(ArrayList<TypeDeclaration> classes, TypeDeclaration classObj) {
		subClasses = new ArrayList<TypeDeclaration>();
		for (TypeDeclaration type : classes) {
			SubClassesControler.setFound(false);
			verifyIfIsSubClass (classes, (ClassOrInterfaceDeclaration)type, (ClassOrInterfaceDeclaration) classObj);
		}
		return subClasses;
		
	}

	private static void verifyIfIsSubClass(ArrayList<TypeDeclaration> classes, ClassOrInterfaceDeclaration type,
			ClassOrInterfaceDeclaration classObj) {
		List<ClassOrInterfaceType> supers = type.getExtends();
		if (supers != null ){
			ClassOrInterfaceType superClass = supers.get(0);
			if (!superClass.getName().equals(classObj.getName())){
				TypeDeclaration superC = searchClass(classes, supers.get(0).getName());
				if (superC != null){
					if (!type.getName().equals(classObj.getName())){
						verifyIfIsSubClass(classes, 
							(ClassOrInterfaceDeclaration) superC, classObj);
						if (!subClasses.contains(type) && SubClassesControler.isFound()){
							subClasses.add(type);
						}	
					}
				}
			}else{
				SubClassesControler.setFound(true);
				if (!subClasses.contains(type)){
					subClasses.add(type);
				}
			}
		}		
	}
	
	
	protected static ArrayList<TypeDeclaration> getSuperClasses(ArrayList<TypeDeclaration> classes, TypeDeclaration classObj) {
		superClasses = new ArrayList<TypeDeclaration>();
		ClassOrInterfaceDeclaration cd = (ClassOrInterfaceDeclaration) classObj;
		while (cd.getExtends() != null) {
			ClassOrInterfaceType c = cd.getExtends().get(0);
			superClasses.add(searchClass(classes, c.getName()));
			cd = (ClassOrInterfaceDeclaration) searchClass(classes, c.getName());
		}
		return superClasses;
		
	}

	protected static TypeObj getType(ArrayList<CompilationUnit> comps, String classID){
		for (CompilationUnit compU : comps) {
			String packStr = compU.getPackage().getName().toString();
			for (TypeDeclaration type : compU.getTypes()) {
				String str;
				if (packStr.equals(""))
					str = type.getName();
				else str = packStr+"."+type.getName();
				if (str.equals(classID))
					return new TypeObj(compU.getPackage(), compU.getImports(), type);
			}
		}
		
		return null;
	}
	
	
	protected static MethodDeclaration getMethod(TypeDeclaration classObj,
			String methodName) {
		for (BodyDeclaration bd : classObj.getMembers()) {
			if (bd instanceof MethodDeclaration) {
				MethodDeclaration md = (MethodDeclaration) bd;
				if (md.getName().equals(methodName)){
//					System.out.println("Achou 2");
					return md;
				}
			}
		}
		return null;
	}
	
	
	protected static ArrayList<MethodDeclaration> getMethods(TypeDeclaration classObj) {
		ArrayList<MethodDeclaration> methods = new ArrayList<>();
		for (BodyDeclaration bd : classObj.getMembers()) {
			if (bd instanceof MethodDeclaration) {
				MethodDeclaration md = (MethodDeclaration) bd;
				methods.add(md);
			}
		}
		return methods;
	}
	
	protected static ArrayList<Statement> getStatements(MethodDeclaration meth, int begin, int end) {
		List<Statement> stms = meth.getBody().getStmts();
		
		ArrayList<Statement> returnStms = new ArrayList<Statement>();
		
		for (Statement statement : stms) {
			if (statement.getBeginLine() >= begin && statement.getEndLine() <= end)
				returnStms.add(statement);
		}
		
		return returnStms;
	}
	
	
	protected static ArrayList<OurMethodDeclaration> fieldAnalysis(TypeDeclaration classObj,
			ArrayList<Statement> changedStms, String packageStr) {
		ArrayList<MethodDeclaration> methods = getMethods(classObj);
		ArrayList<ExprObj> changedFields = (ArrayList<ExprObj>) getFieldsIn(changedStms);
		
		ArrayList<OurMethodDeclaration> affectedMeths = new ArrayList<OurMethodDeclaration>();
		
		for (MethodDeclaration method : methods) {
			LinkedList<Statement> stms = (LinkedList<Statement>) method.getBody().getStmts();
			if (stms != null){
				ArrayList<ExprObj> fields = (ArrayList<ExprObj>) getFieldsIn(stms);
				if (commonElements(fields, changedFields))
					affectedMeths.add(new OurMethodDeclaration(method.getName()+packageStr, method.getParameters()));
			}
		}
		
		//write(affectedMeths);
		return affectedMeths;
	}
	
	protected static ArrayList<OurMethodDeclaration> getMethodThatAccessField(TypeDeclaration classObj,
			String fieldName, String packD) {
		ArrayList<MethodDeclaration> methods = getMethods(classObj);
		ArrayList<OurMethodDeclaration> affectedMeths = new ArrayList<OurMethodDeclaration>();
		
		for (MethodDeclaration method : methods) {
			LinkedList<Statement> stms = (LinkedList<Statement>) method.getBody().getStmts();
			if (stms != null){
				for (Statement statement : stms) {
					if (accessField(statement, fieldName)){
						affectedMeths.add(new OurMethodDeclaration(method.getName()+packD, method.getParameters()));
						break;
					}
				}
			}
		}
		
		//write(affectedMeths);
		return affectedMeths;
	}


	private static boolean accessField(Statement statement, String fieldName) {
		ArrayList<Statement> list = new ArrayList<Statement>();
		list.add(statement);
		List<ExprObj> fields = getFieldsIn(list);
		
		for (ExprObj exprObj : fields) {
			if (exprObj.getName().equals(fieldName))
				return true;
		}
		return false;
	}

	private static boolean commonElements(ArrayList<ExprObj> fields,
			ArrayList<ExprObj> changedFields) {
		for (ExprObj changed : changedFields) {
			for (ExprObj field : fields) {
				if (changed.equals(field))
					return true;
			}
		}
		return false;
	}


	/* 
	 * Estratégia:
	 * Pegar todos os NameExp e ThisExt que estão dentro das linhas dos statements fornecidos
	 */
	protected static List<ExprObj> getFieldsIn(
			List<Statement> changedStms) {
		XStream xstream = new XStream();
		ArrayList<ExprObj> nameExprs = new ArrayList<>();
		for (Statement statement : changedStms) {
			//statement.toString().split("[\\.\\(\\) =><\\?&|,;]");
			int beingLine = statement.getBeginLine();
			int endLine = statement.getEndLine();
			
			String xmlObj = xstream.toXML(statement);
			Scanner s = new Scanner(xmlObj);
			boolean fieldAccess = false;
			boolean thisExp = false;
			ExprObj ne;
			
			while (s.hasNext()){
				String line = s.nextLine();
				if (line.contains("japa.parser.ast.expr.FieldAccessExpr"))
					fieldAccess = true;
				if (line.contains("/japa.parser.ast.expr.FieldAccessExpr"))
					fieldAccess = false;
				if (line.contains("<field>") && fieldAccess){
					String fieldName = (String) line.subSequence(line.indexOf("<field>")+7, line.indexOf("</field>"));
					
					ExprObj lastAdded = nameExprs.get(nameExprs.size()-1);
					nameExprs.remove(lastAdded);
					String name = lastAdded.getName();
					if (!name.equals(""))
						lastAdded.setName(name+"."+fieldName);
					else lastAdded.setName(fieldName);
					nameExprs.add(lastAdded);
				}
				if ((line.contains("japa.parser.ast.expr.NameExpr") && !line.contains("/japa.parser.ast.expr.NameExpr"))
						|| (line.contains("japa.parser.ast.expr.ThisExpr") && !line.contains("/japa.parser.ast.expr.ThisExpr"))){
					
					if (line.contains("japa.parser.ast.expr.ThisExpr"))
						thisExp = true;
					
					String line2 = s.nextLine();
					String begLineStr = (String) line2.subSequence(line2.indexOf("<beginLine>")+11, line2.indexOf("</beginLine>"));
					int bLine = Integer.parseInt(begLineStr);
					
					s.nextLine();
					line2 = s.nextLine();
					String endLineStr = (String) line2.subSequence(line2.indexOf("<endLine>")+9, line2.indexOf("</endLine>"));
					int eLine = Integer.parseInt(endLineStr);
					
					if (!thisExp){
						s.nextLine();
						line2 = s.nextLine();
						String name = (String) line2.subSequence(line2.indexOf("<name>")+6, line2.indexOf("</name>"));
						ne = new ExprObj(beingLine, eLine, name);
					}else {
						ne = new ExprObj(beingLine, eLine, "");
					}
					
					if (!nameExprs.contains(ne))
						nameExprs.add(ne);
				}
			}
			
		}
		return nameExprs;
	}

	
//	protected static void argumentAnalysis(TypeDeclaration classObj,
//			ArrayList<Statement> changedStms) {
//		ArrayList<MethodDeclaration> methods = getMethods(classObj);
//		ArrayList<ExprObj> changedFields = (ArrayList<ExprObj>) getFieldsIn(changedStms);
//		
//		ArrayList<MethodDeclaration> affectedMeths = new ArrayList<MethodDeclaration>();
//		
//		for (MethodDeclaration method : methods) {
//			LinkedList<Statement> stms = (LinkedList<Statement>) method.getBody().getStmts();
//			ArrayList<ExprObj> fields = (ArrayList<ExprObj>) getFieldsIn(stms);
//			if (commonElements(fields, changedFields))
//				affectedMeths.add(method);
//		}
//		
//		write(affectedMeths);
//		
//	}
	

	protected static void write(ArrayList<MethodDeclaration> affectedMeths) {
		for (MethodDeclaration obj : affectedMeths) {
			System.out.println(obj.getName());
		}
		
	}
	
	protected static void write2(HashSet<OurMethodDeclaration> affectedMeths) {
		for (OurMethodDeclaration obj : affectedMeths) {
			System.out.println(obj);
		}
		
	}
}
