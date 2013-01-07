package util;

import japa.parser.ast.ImportDeclaration;
import japa.parser.ast.PackageDeclaration;
import japa.parser.ast.body.TypeDeclaration;

import java.util.List;

public class TypeObj{

	private PackageDeclaration packageD;
	private List<ImportDeclaration> imports;
	private TypeDeclaration type;
	
	public TypeObj(PackageDeclaration packageD,
			List<ImportDeclaration> imports, TypeDeclaration type) {
		this.packageD = packageD;
		this.imports = imports;
		this.type = type;
	}

	public PackageDeclaration getPackageD() {
		return packageD;
	}

	public void setPackageD(PackageDeclaration packageD) {
		this.packageD = packageD;
	}

	public List<ImportDeclaration> getImports() {
		return imports;
	}

	public void setImports(List<ImportDeclaration> imports) {
		this.imports = imports;
	}

	public TypeDeclaration getType() {
		return type;
	}

	public void setType(TypeDeclaration type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o){
		TypeObj obj = (TypeObj) o;
		return this.type.equals(obj.type) && this.packageD.equals(obj.packageD) && this.imports.equals(obj.imports); 
	}
	
	public String toString(){
		return packageD.getName()+"."+type.getName();
	}

}
