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
		String path = "examples/jmock-1.1.0/core";
//		String path = "examples";
		FacadeRBA f = new FacadeRBA();
		ArrayList<CompilationUnit> comps = f.parse(path);
		f.getImpactedElementsRenameMethod(comps, "org.jmock.core.matcher.InvokeAtLeastOnceMatcher", "hasDescription", "hasBeenInvoked");
		f.getImpactedElementsExtractMethod(comps, "org.jmock.core.stub.ThrowStub", "reportIncompatibleCheckedException(Class[] allowedTypes)", "newMeth", 42, 42);
		f.getImpactedElementsMoveMethod(comps, "org.jmock.core.DynamicMockError", "org.jmock.core.InvocationMocker", "getMessage");
		f.getImpactedElementsPullUpMethod(comps, "org.jmock.core.matcher.InvokeAtLeastOnceMatcher", "org.jmock.core.matcher.InvokedRecorder", "hasDescription");
		f.getImpactedElementsPullUpField(comps, "org.jmock.expectation.ExpectationSet", "org.jmock.expectation.AbstractExpectationCollection", "myActualItems");
		f.getImpactedElementsAddParameter(comps, "org.jmock.expectation.AssertMo", "assertEquals( String description, Object[] expectedArray, Object[] actualArray)");
	}

}
