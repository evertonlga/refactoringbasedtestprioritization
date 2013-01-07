package callGraph;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import org.aspectj.lang.Signature;


public class CallLogger {

	public static CallLogger INSTANCE = new CallLogger();
	private Stack<MethodCall> callStack = new Stack<MethodCall>();
	private Set<String> callLog = new HashSet<String>();
	private Writer writer;

	public CallLogger() {
		try {
			writer = new BufferedWriter(new FileWriter("calls.txt"));
		} catch (IOException e) {
			throw new RuntimeException("Cannot open 'calls.txt' for writing.", e);
		}
	}

	public void pushMethod(Signature s, int level) {
		String type = s.getDeclaringType().getName();
		String method = type.substring(type.lastIndexOf('.') + 1) + "." + s.getName();
		callStack.push(new MethodCall(method, level));
	}
	
	public void pushFieldRead(Signature s) {
		String type = s.getDeclaringType().getName();
		String field = type.substring(type.lastIndexOf('.') + 1) + "." + s.getName();
		MethodCall last = callStack.lastElement();
		ArrayList<LookupField> lastLF = last.getLookupF();
		LookupField lf = new LookupField(LookupFieldType.FR, field);
		lastLF.add(lf);
		last.setLookupF(lastLF);
	}
	
	public void pushStaticFieldRead(Signature s) {
		String type = s.getDeclaringType().getName();
		String field = type.substring(type.lastIndexOf('.') + 1) + "." + s.getName();
		MethodCall last = callStack.lastElement();
		ArrayList<LookupField> lastLF = last.getLookupF();
		LookupField lf = new LookupField(LookupFieldType.SFR, field);
		lastLF.add(lf);
		last.setLookupF(lastLF);
	}
	
	public void pushFieldWrite(Signature s) {
		String type = s.getDeclaringType().getName();
		String field = type.substring(type.lastIndexOf('.') + 1) + "." + s.getName();
		MethodCall last = callStack.lastElement();
		ArrayList<LookupField> lastLF = last.getLookupF();
		LookupField lf = new LookupField(LookupFieldType.FW, field);
		lastLF.add(lf);
		last.setLookupF(lastLF);
	}
	
	public void pushStaticFieldWrite(Signature s) {
		String type = s.getDeclaringType().getName();
		String field = type.substring(type.lastIndexOf('.') + 1) + "." + s.getName();
		MethodCall last = callStack.lastElement();
		ArrayList<LookupField> lastLF = last.getLookupF();
		LookupField lf = new LookupField(LookupFieldType.SFW, field);
		lastLF.add(lf);
		last.setLookupF(lastLF);
	}

	public void popMethod() {
		callStack.pop();
	}

	public void logCall() {
		if(callStack.size() < 2)
			return;
		String call = "\"" + top(1) + "\" -> \"" + top(0) +"\"";
		if(!callLog.contains(call)) {
			write(call);
			callLog.add(call);
		}
	}

	private String top(int i) {
		return callStack.get(callStack.size() - (i + 1)).toString();
	}

	private void write(String line) {
		try {
			writer.write(line + "\n");
			writer.flush();
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	public Stack<MethodCall> getCallStack() {
		return callStack;
	}

	public void setCallStack(Stack<MethodCall> callStack) {
		this.callStack = callStack;
	}

	public Set<String> getCallLog() {
		return callLog;
	}

	public void setCallLog(Set<String> callLog) {
		this.callLog = callLog;
	}

	public void logEmptyLine() {
		write("\n");
		
	}

	
}
