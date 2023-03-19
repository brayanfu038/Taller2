package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileManager {
	
	File file;
	FileReader  fileReader;
	BufferedReader reader;
	
	public TextFileManager(String path) throws IOException {
		file = new File(path);
		fileReader = new FileReader(file);
		reader = new BufferedReader(fileReader);
	}
	
	//Este metodo lee el contenido de un archivo de texto  sin espacios.
	
	public String readTextFile() throws IOException {
		int value;
		char temp;
		String acumulator="";
		while((value = fileReader.read())!=-1) {
			if(value!=32) {
				acumulator += ""+(char)value;
			}	
		}
		return acumulator;
	}
	
	public void closeFile() throws IOException {
		fileReader.close();
	}
}
