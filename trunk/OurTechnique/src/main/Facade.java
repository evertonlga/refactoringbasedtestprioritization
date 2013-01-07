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

public class Facade {
	
	public ArrayList<CompilationUnit> parse(String path) throws DBException{
		Parser parser = new Parser();
		return parser.parse(path);
	}
	
	public HashSet<OurMethodDeclaration> getImpactedElementsRenameMethod(ArrayList<CompilationUnit> comps,
			String className, String methodName, String newName) throws DBException{
		HashSet<OurMethodDeclaration> impacted = RenameMethod.getImpactedMethods(comps, className, methodName, newName);
		return impacted;
	}
	
	public HashSet<OurMethodDeclaration> getImpactedElementsExtractMethod(
			ArrayList<CompilationUnit> comps, String className, String origMethodName,
			String newMethName, int beginLine, int endLine) {
		HashSet<OurMethodDeclaration> impacted = ExtractMethod.getImpactedMethods(comps, className, origMethodName, newMethName, beginLine, endLine);
		return impacted;
	}
	
	public HashSet<OurMethodDeclaration> getImpactedElementsMoveMethod(
			ArrayList<CompilationUnit> comps, String classOneName, String classTwoName,
			String methName) {
		HashSet<OurMethodDeclaration> impacted = MoveMethod.getImpactedMethods(comps, classOneName, classTwoName, methName);
		return impacted;
	}
	
	public HashSet<OurMethodDeclaration> getImpactedElementsPullUpMethod(
			ArrayList<CompilationUnit> comps, String classOneName, String classTwoName,
			String methName) {
		HashSet<OurMethodDeclaration> impacted = PullUpMethod.getImpactedMethods(comps, classOneName, classTwoName, methName);
		return impacted;
	}
	
	public HashSet<OurMethodDeclaration> getImpactedElementsPullUpField(
			ArrayList<CompilationUnit> comps, String classOneName, String classTwoName,
			String fieldName) {
		HashSet<OurMethodDeclaration> impacted = PullUpField.getImpactedMethods(comps, classOneName, classTwoName, fieldName);
		return impacted;
	}
	
	public HashSet<OurMethodDeclaration> getImpactedElementsAddParameter(
			ArrayList<CompilationUnit> comps, String className, String methodName) {
		HashSet<OurMethodDeclaration> impacted = AddParameter.getImpactedMethods(comps, className, methodName);
		return impacted;
	}
	
	public static void main(String args[]) throws DBException{
//		String path = "examples/jmock-1.1.0/core";
		String path = "examples";
		Facade f = new Facade();
		ArrayList<CompilationUnit> comps = f.parse(path);
		f.getImpactedElementsRenameMethod(comps, "callGraph.CallLogger", "write(String line)", "test()");
//		f.getImpactedElementsExtractMethod(comps, "callGraph.CallLogger", "pushFieldRead(Signature s)", "newMeth", 37, 39);
//		f.getImpactedElementsMoveMethod(comps, "callGraph.CallLogger", "pack.C", "pushFieldRead(Signature s)");
//		f.getImpactedElementsPullUpMethod(comps, "pack.C", "pack.B", "test()");
//		f.getImpactedElementsPullUpField(comps, "pack.B", "pack.A", "v");
//		HashSet<OurMethodDeclaration> impactedMeths = f.getImpactedElementsAddParameter(comps, "org.jmock.builder.InvocationMockerBuilder", "setStub( Stub stubAction )");
	}

}
