package dao;

import japa.parser.ast.CompilationUnit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

import exceptions.DBException;

public class XML_BD {
	private XStream xstream;
	private ArrayList<CompilationUnit> compUnits;
	private String path = "compUnits.xml";
	
	public XML_BD() throws DBException {
        xstream = new XStream();
        xstream.setMode(XStream.NO_REFERENCES);

    }
	
	public ArrayList<CompilationUnit> getObject() {
		try {
            compUnits = (ArrayList<CompilationUnit>) xstream.fromXML(new FileInputStream(path));
        } catch (Exception e) {
        	compUnits = new ArrayList<CompilationUnit>();
        }
		return getCompUnits();
	}

	public void restartBD() {
		ArrayList<CompilationUnit> comps = new ArrayList<CompilationUnit>();
		setCompUnits(comps);
	}

	
	public void setBD(ArrayList<CompilationUnit> comps){
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(new File(path));
			xstream.toXML(comps,fos);
//			fos.write(xstream.toString().getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private ArrayList<CompilationUnit> getCompUnits() {
		return compUnits;
	}

	private void setCompUnits(ArrayList<CompilationUnit> compUnits) {
		this.compUnits = compUnits;
	}
	
	

}
