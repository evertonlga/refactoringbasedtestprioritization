package parser;

import japa.parser.JavaParser;
import japa.parser.ParseException;
import japa.parser.ast.CompilationUnit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.Factory;
import exceptions.DBException;

public class Parser {

	public ArrayList<CompilationUnit> parse(String path) throws DBException {
		ArrayList<CompilationUnit> comps = getCompilationUnits(path);
		save(comps);
		return comps;
	}
	
	
	private void save(ArrayList<CompilationUnit> comps) throws DBException {
		Factory.saveInstance(comps);
	}


	List<File> files = new ArrayList<File>();
	public void listFiles(File f){		
		if (f.isDirectory()){
			File[] sub = f.listFiles();
			for (File file : sub) {
				if (file.isDirectory())
					listFiles(file);
				else files.add(file);
			}
		}
//		return (ArrayList<File>) files;
	}
	
	public ArrayList<CompilationUnit> getCompilationUnits(String path){
		ArrayList<CompilationUnit> comps = new ArrayList<>();
		File dir = new File(path);
		listFiles(dir);
		System.out.println(files.size());
		
		CompilationUnit compU;
		for (File file : files) {
			if (file.getName().endsWith(".java"))
				try {
					System.out.println("Parsing "+file.getAbsolutePath()+"...");
					compU = JavaParser.parse(file);
					comps.add(compU);
				} catch (ParseException | IOException e) {
					System.out.println("We could not parse the specified file.");
				}
		}		
		return comps;
	}

}
