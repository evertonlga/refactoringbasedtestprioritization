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

	private static ArrayList<TypeObj> subClasses;
	private static ArrayList<TypeObj> superClasses;

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
								return true;
							}
						}
					}else{
						if (index > 0 && stm.toString().charAt(index-1) == ' ')
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
						if (index - 6 > 0){
							String subString = (String) stm.toString().subSequence(index-6, index);
							if (subString.contains("this.") || (subString.equals("super."))){
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
	
	protected static ArrayList<TypeObj> allclasses(ArrayList<CompilationUnit> comps) {
		ArrayList<TypeObj> classes = new ArrayList<TypeObj>();
		
		for (CompilationUnit comp : comps) {
			for (TypeDeclaration type : comp.getTypes()) {
				classes.add(new TypeObj(comp.getPackage(), comp.getImports(), type));
			}
		}
		return classes;
	}
	

	private static TypeObj searchClass(
			ArrayList<TypeObj> classes, String classname) {
		for (TypeObj typeObj : classes) {
			if (typeObj.getType().getName().equals(classname))
				return typeObj;
		}
		return null;
	}

	
	protected static ArrayList<TypeObj> getSubClasses(ArrayList<TypeObj> classes, TypeDeclaration classObj) {
		subClasses = new ArrayList<TypeObj>();
		for (TypeObj to : classes) {
			SubClassesControler.setFound(false);
			verifyIfIsSubClass (classes, (ClassOrInterfaceDeclaration)to.getType(), (ClassOrInterfaceDeclaration) classObj);
		}
		return subClasses;
		
	}

	private static void verifyIfIsSubClass(ArrayList<TypeObj> classes, ClassOrInterfaceDeclaration type,
			ClassOrInterfaceDeclaration classObj) {
		List<ClassOrInterfaceType> supers = type.getExtends();
		if (supers != null ){
			ClassOrInterfaceType superClass = supers.get(0);
			if (!superClass.getName().equals(classObj.getName())){
				TypeObj superC = searchClass(classes, supers.get(0).getName());
				if (superC != null){
					if (!type.getName().equals(classObj.getName())){
						verifyIfIsSubClass(classes, 
							(ClassOrInterfaceDeclaration) superC.getType(), classObj);
						if (!contains(subClasses,type) && SubClassesControler.isFound()){
							subClasses.add(searchClass(classes, type.getName()));
						}	
					}
				}
			}else{
				SubClassesControler.setFound(true);
				if (!contains(subClasses, type)){
					subClasses.add(searchClass(classes, type.getName()));
				}
			}
		}		
	}
	
	
	private static boolean contains(ArrayList<TypeObj> subClasses,
			ClassOrInterfaceDeclaration type) {
		for (TypeObj sub : subClasses) {
			if (sub.getType().equals(type))
				return true;
		}
		return false;
	}

	protected static ArrayList<TypeObj> getSuperClasses(ArrayList<TypeObj> classes, TypeDeclaration classObj) {
		superClasses = new ArrayList<TypeObj>();
		ClassOrInterfaceDeclaration cd = (ClassOrInterfaceDeclaration) classObj;
		while (cd.getExtends() != null) {
			ClassOrInterfaceType c = cd.getExtends().get(0);
			superClasses.add(searchClass(classes, c.getName()));
			cd = (ClassOrInterfaceDeclaration) searchClass(classes, c.getName()).getType();
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
			String methodString) {
		for (BodyDeclaration bd : classObj.getMembers()) {
			if (bd instanceof MethodDeclaration) {
				MethodDeclaration md = (MethodDeclaration) bd;
//				int index = methodString.lastIndexOf("_");
//				if (index == -1){
					int leftPar = methodString.indexOf("(");
					int rigthPar = methodString.indexOf(")");
					if (leftPar != -1 && rigthPar != -1){
						String param = methodString.substring(leftPar+1, rigthPar);
						param = "["+param.trim()+"]";
						if (md.getName().equals(methodString.subSequence(0,leftPar)))
							if (md.getParameters() == null && param.equals("[]")){
								return md;
							}else if (md.getParameters() != null && md.getParameters().toString().trim().equals(param)){
								return md;
							}
					} else{
						if (methodString.equals(((MethodDeclaration) bd).getName()))
							return md;
					}
//				}
//				else{
//					if (index != -1){
//						String methN = methodString.substring(0, index);
//						String param = (methodString.substring(methodString.indexOf("(")+1, methodString.indexOf(")"))).trim();
//						if (md.getName().equals(methN))
//							if ((md.getParameters() != null && md.getParameters().toString().trim().equals(param)) ||
//									(md.getParameters() != null && param.equals(""))){
////							System.out.println("Achou 2");
//							return md;
//						}
//					}
//				}
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
		ArrayList<Statement> returnStms = null;
		try {
			List<Statement> stms = meth.getBody().getStmts();
			
			returnStms = new ArrayList<Statement>();
			
			for (Statement statement : stms) {
				if (statement.getBeginLine() >= begin && statement.getEndLine() <= end)
					returnStms.add(statement);
			}
		} catch (NullPointerException e) {

		}
		
		return returnStms;
	}
	
	
	protected static ArrayList<OurMethodDeclaration> fieldAnalysis(MethodDeclaration meth, TypeDeclaration classObj,
			ArrayList<Statement> changedStms, String packageStr) {
		ArrayList<MethodDeclaration> methods = getMethods(classObj);
		ArrayList<ExprObj> changedFields = (ArrayList<ExprObj>) getFieldsIn(changedStms);
		changedFields = excludingLocalFields(meth, changedFields);
		
		ArrayList<OurMethodDeclaration> affectedMeths = new ArrayList<OurMethodDeclaration>();
		
		for (MethodDeclaration method : methods) {
			try {
				LinkedList<Statement> stms = (LinkedList<Statement>) method.getBody().getStmts();
				if (stms != null){
					ArrayList<ExprObj> fields = (ArrayList<ExprObj>) getFieldsIn(stms);
					if (commonElements(fields, changedFields))
						affectedMeths.add(new OurMethodDeclaration(method.getName()+packageStr, method.getParameters()));
				}
			} catch (NullPointerException e) {
				// TODO: handle exception
			}
		}
		
		//write(affectedMeths);
		return affectedMeths;
	}
	
	private static ArrayList<ExprObj> excludingLocalFields(
			MethodDeclaration meth, ArrayList<ExprObj> changedFields) {
		XStream xstream = new XStream();
		String xmlObj = xstream.toXML(meth);
		ArrayList<ExprObj> returnSet = changedFields;
		
		Scanner input = new Scanner(xmlObj);
		String varStr = "";
		while (input.hasNext()){
			String line = input.nextLine();
			if (line.contains("japa.parser.ast.body.VariableDeclarator")){
				boolean varDec = true;
				while (varDec){
					line = input.nextLine();
					if (line.contains("/japa.parser.ast.body.VariableDeclarator"))
						varDec = false;
					else{
						varStr+= line+"\n";
					}
				}
			}
		}
		
		ArrayList<String > varNames = getVarNames (varStr);
		returnSet = new ArrayList<ExprObj>();
		for (ExprObj field : changedFields) {
			int index = 0;
			boolean notFound = true;
			while (index < varNames.size() && notFound){
				String varName = varNames.get(index);
				if (field.getName().equals(varName))
					notFound = false;
				index++;
			}
			if (notFound)
				returnSet.add(field);
		}
		
		return returnSet;
	}

	private static ArrayList<String> getVarNames(String varStr) {
		ArrayList<String> ret = new ArrayList<>();
		Scanner input = new Scanner(varStr);
		while (input.hasNext()){
			String line = input.nextLine();
			if (line.contains("<name>") && line.contains("</name>")){
				String e = line.substring(line.indexOf("<name>")+6, line.indexOf("</name>"));
					ret.add(e);
			}
		}
		return ret;
	}

	protected static ArrayList<OurMethodDeclaration> getMethodThatAccessField(TypeDeclaration classObj,
			String fieldName, String packD) {
		ArrayList<MethodDeclaration> methods = getMethods(classObj);
		ArrayList<OurMethodDeclaration> affectedMeths = new ArrayList<OurMethodDeclaration>();
		
		for (MethodDeclaration method : methods) {
			try {
				LinkedList<Statement> stms = (LinkedList<Statement>) method.getBody().getStmts();
				if (stms != null){
					for (Statement statement : stms) {
						if (accessField(statement, fieldName)){
							affectedMeths.add(new OurMethodDeclaration(
									method.getName()+packD+"."+classObj.getName(), method.getParameters()));
							break;
						}
					}
				}
			} catch (NullPointerException e) {
				// TODO: handle exception
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
	 * Estrat�gia:
	 * Pegar todos os NameExp e ThisExt que est�o dentro das linhas dos statements fornecidos
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
	
	protected static ArrayList<String> affectedToString(HashSet<OurMethodDeclaration> affectedMeths) {
		ArrayList<String> returnSet = new ArrayList<String>();
		for (OurMethodDeclaration obj : affectedMeths) {
			returnSet.add(obj.toString());
		}
		return returnSet;
	}
	
	public static HashSet<OurMethodDeclaration> excludeRepetitions(
			HashSet<OurMethodDeclaration> impactedMethods) {
		HashSet<OurMethodDeclaration> set = new HashSet<>();
		for (OurMethodDeclaration meth : impactedMethods) {
			if (!contains(set, meth))
				set.add(meth);
		}
		return set;
	}

	private static boolean contains(HashSet<OurMethodDeclaration> set,
			OurMethodDeclaration meth) {
		for (OurMethodDeclaration ourMethodDeclaration : set) {
			if (ourMethodDeclaration.toString().equals(meth.toString()))
				return true;
		}
		return false;
	}
}
