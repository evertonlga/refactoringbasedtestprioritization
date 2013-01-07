package util;

import japa.parser.ast.body.Parameter;

import java.util.ArrayList;
import java.util.List;

public class OurMethodDeclaration {

	String name;
	List<Parameter> parameters;
	
	public OurMethodDeclaration(String name, List<Parameter> parameters){
		this.name = name;
		if (parameters != null)
			this.parameters = parameters;
		else this.parameters = new ArrayList<Parameter>();
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
	
	public boolean equals(Object o){
		OurMethodDeclaration obj = (OurMethodDeclaration) o;
		return this.name.equals(obj.name) && this.parameters.equals(obj.getParameters());
	}
	
	public String toString (){
		if (parameters != null)
			return name+"("+parameters.toString()+")";
		else return name +"()";
	}
}
