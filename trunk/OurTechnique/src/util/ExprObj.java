package util;

public class ExprObj{

	int beginLine;
	int endLine;
	String name;
	
	public ExprObj(int beginLine, int endLine, String name){
		this.beginLine = beginLine;
		this.endLine = endLine;
		this.name = name;
	}

	public int getBeginLine() {
		return beginLine;
	}

	public void setBeginLine(int beginLine) {
		this.beginLine = beginLine;
	}

	public int getEndLine() {
		return endLine;
	}

	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return getName();
	}
	
	public boolean equals(Object o){
		ExprObj obj = (ExprObj) o;
		return this.name.equals(obj.getName());
	}
	
}
