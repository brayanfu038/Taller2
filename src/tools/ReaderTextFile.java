package tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderTextFile {
	File file;
	FileReader fr;
	BufferedReader bw; 
	ArrayList<String>lines;
	public ReaderTextFile(String path) throws FileNotFoundException {
		file = new File(path);
		fr= new FileReader(file);
		bw = new BufferedReader(fr);
		lines = new ArrayList();
	}
	public String  readFile() throws IOException {
		String aux="";
		String str = "";
		while ((str=bw.readLine())!=null) {
			 aux+=str+"\n";
		}
		return  aux;
	}
	public ArrayList<String> getLines() {
		return lines;
	}
	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}
}
