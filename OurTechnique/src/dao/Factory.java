package dao;

import japa.parser.ast.CompilationUnit;

import java.util.ArrayList;

import exceptions.DBException;
 
public class Factory {

	public static ArrayList<CompilationUnit> getInstance() throws DBException{
		XML_BD xmlDB = new XML_BD(); 
		return xmlDB.getObject();
	}

	public static void saveInstance(ArrayList<CompilationUnit> comps) throws DBException {
		XML_BD xmlDB = new XML_BD();
		xmlDB.setBD(comps);
	}
}
