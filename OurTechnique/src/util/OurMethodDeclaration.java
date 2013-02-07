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
		String methName = name.substring(0, name.indexOf("_"));
		String path = name.substring(name.indexOf("_")+1);
		if (parameters != null)
			return path+"_"+methName+"("+parameters.toString()+")";
		else return path+"_"+name +"()";
	}
	
	
	public int hashcode(){
		return 1;
	}
}
