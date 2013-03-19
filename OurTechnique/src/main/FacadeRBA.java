package main;
import japa.parser.ast.CompilationUnit;
import java.util.ArrayList;
import java.util.HashSet;

import exceptions.DBException;
import parser.Parser;
import patterns.AddParameter;
import patterns.ExtractMethod;
import patterns.MoveMethod;
import patterns.PullUpField;
import patterns.PullUpMethod;
import patterns.RenameMethod;
import util.OurMethodDeclaration;

public class FacadeRBA {
	
	public ArrayList<CompilationUnit> parse(String path) throws DBException{
		Parser parser = new Parser();
		return parser.parse(path);
	}
	
	public ArrayList<String> getImpactedElementsRenameMethod(ArrayList<CompilationUnit> comps,
			String className, String methodName, String newName) throws DBException{
		return RenameMethod.getImpactedMethods(comps, className, methodName, newName);
	}
	
	public ArrayList<String> getImpactedElementsExtractMethod(
			ArrayList<CompilationUnit> comps, String className, String origMethodName,
			String newMethName, int beginLine, int endLine) {
		return ExtractMethod.getImpactedMethods(comps, className, origMethodName, newMethName, beginLine, endLine);
	}
	
	public ArrayList<String> getImpactedElementsMoveMethod(
			ArrayList<CompilationUnit> comps, String classOneName, String classTwoName,
			String methName) {
		return MoveMethod.getImpactedMethods(comps, classOneName, classTwoName, methName);
	}
	
	public ArrayList<String> getImpactedElementsPullUpMethod(
			ArrayList<CompilationUnit> comps, String classOneName, String classTwoName,
			String methName) {
		return PullUpMethod.getImpactedMethods(comps, classOneName, classTwoName, methName);
	}
	
	public ArrayList<String> getImpactedElementsPullUpField(
			ArrayList<CompilationUnit> comps, String classOneName, String classTwoName,
			String fieldName) {
		return PullUpField.getImpactedMethods(comps, classOneName, classTwoName, fieldName);
	}
	
	public ArrayList<String> getImpactedElementsAddParameter(
			ArrayList<CompilationUnit> comps, String className, String methodName) {
		return AddParameter.getImpactedMethods(comps, className, methodName);
	}
	
	public static void main(String args[]) throws DBException{
//		String path = "examples/jmock-1.1.0/core";
//		String path = "examples";
//		String path = "examples/MM_7/src";
//		String edit = "moveMethod";
		
		String path = args[0];
		String edit = args[1];
		
		FacadeRBA f = new FacadeRBA();
		ArrayList<CompilationUnit> comps = f.parse(path);
		
		switch (edit) {
		case "renameMethod":
			f.getImpactedElementsRenameMethod(comps, args[2], args[3], args[4]);
			break;
		case "extractMethod":
			f.getImpactedElementsExtractMethod(comps, args[2], args[3], args[4], Integer.parseInt(args[5]), Integer.parseInt(args[6]));
			break;
		case "moveMethod":
			f.getImpactedElementsMoveMethod(comps, args[2], args[3], args[4]);
			break;
		case "pullUpMethod":
			f.getImpactedElementsPullUpMethod(comps, args[2], args[3], args[4]);
			break;
		case "pullUpField":
			f.getImpactedElementsPullUpField(comps, args[2], args[3], args[4]);
			break;
		case "addParameter":
			f.getImpactedElementsAddParameter(comps, args[2], args[3]);
			break;
		default:
			break;
		}
		
		
//		f.getImpactedElementsRenameMethod(comps, "org.jmock.core.matcher.InvokeAtLeastOnceMatcher", "hasDescription", "hasBeenInvoked");
//		f.getImpactedElementsExtractMethod(comps, "org.jmock.core.stub.ThrowStub", "reportIncompatibleCheckedException(Class[] allowedTypes)", "newMeth", 42, 42);
//		f.getImpactedElementsMoveMethod(comps, "org.jmock.core.DynamicMockError", "org.jmock.core.InvocationMocker", "getMessage");
//		f.getImpactedElementsPullUpMethod(comps, "org.jmock.core.matcher.InvokeAtLeastOnceMatcher", "org.jmock.core.matcher.InvokedRecorder", "hasDescription");
//		f.getImpactedElementsPullUpField(comps, "org.jmock.expectation.ExpectationSet", "org.jmock.expectation.AbstractExpectationCollection", "myActualItems");
//		f.getImpactedElementsAddParameter(comps, "org.jmock.expectation.AssertMo", "assertEquals( String description, Object[] expectedArray, Object[] actualArray)");
	
//		ArrayList<String> impactedMeths = f.getImpactedElementsPullUpMethod(comps, "p1.B", "p1.A", "k");
//		ArrayList<String> impactedMeths = f.getImpactedElementsPullUpMethod(comps, "p1.B", "p1.C", "m");
//		ArrayList<String> impactedMeths = f.getImpactedElementsMoveMethod(comps, "p2.A_0", "p1.ClassId_0", "m_0(int a)");
//		for (String string : impactedMeths) {
//			System.out.println(string);
//		}
	}

}
