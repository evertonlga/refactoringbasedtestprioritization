package util;

import japa.parser.ast.body.Parameter;

import java.util.ArrayList;
import java.util.List;

public class OurMethodDeclaration{

	String name;
	List<Parameter> parameters;
	static int hashcode = 0;
	
	public OurMethodDeclaration(String name, List<Parameter> parameters){
		this.name = name;
		if (parameters != null)
			this.parameters = parameters;
		else this.parameters = new ArrayList<Parameter>();
		hashcode = hashcode++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public boolean equals(Object o){
		OurMethodDeclaration obj = (OurMethodDeclaration) o;
		return this.name.equals(obj.name) && this.parameters.equals(obj.getParameters());
	}
	
	@Override
	public String toString (){
		String methName = name.substring(0, name.indexOf("*"));
		String path = name.substring(name.indexOf("*")+1);
		String retStr;
		if (parameters != null){
			retStr = path+"*"+methName+"("+parameters.toString()+")";
		}
		else {
			retStr = path+"*"+name +"()";
		}
		return retStr;
	}
	
	
	public int hashcode(){
		return 1;
	}
}
