package model;

import java.io.File;
import java.io.IOException;

import tools.ReaderBinaryText;
import tools.ReaderTextFile;
import tools.WriterBinaryFile;
import tools.WriterTextFile;

public class FileManager {
	private String path1;
	private String path2;
	private String text1;
	private String text2;
	File file;
	ReaderBinaryText inputStream;
	WriterBinaryFile outputStream;
	ReaderTextFile readerText;
	WriterTextFile writerText;
	
	public void readFirstPath(String path) throws IOException {
		path1 = path;
		inputStream = new ReaderBinaryText(path);
		text1 = inputStream.ReadText();
	}
	public void readSecondPath(String path) throws IOException {
		path2= path;
		readerText = new ReaderTextFile(path);
		text2 =readerText.readFile();
	}
	public String  combinatePaths(String option) {
		String extension="";
		if(option.equals("TXT") ) {
			extension = ".txt";
		}else {
			extension = ".bin";
		}
		return "Resources\\"+this.getPathName(path1)+"-"+this.getPathName(path2)+extension;
	}
	public String  getPathName(String path) {
	String[] names = path.split("\\\\");
	String[] name = names[1].split("\\.");
		return name[0];
		
	}
	public void WriteTextFile(String path,boolean decision) throws IOException{
		writerText = new WriterTextFile(path,decision);
		writerText.toWriter(text1+":"+text2);
		
	}
	public void writerBinaryFile(String path,boolean decision) throws IOException {
		outputStream = new WriterBinaryFile(path,decision);
		outputStream.writeText(text1+":"+text2);
	}
	public void WriteTextFile(String path) throws IOException{
		writerText = new WriterTextFile(path);
		writerText.toWriter(text1+":"+text2);
		
	}
	public void writerBinaryFile(String path) throws IOException {
		outputStream = new WriterBinaryFile(path);
		outputStream.writeText(text1+":"+text2);
	}
	public boolean  ValidateExistence(String path) {
		file = new File(path);
		
		return file.exists();
		
	}
	
	public String getPath1() {
		return path1;
	}
	public void setPath1(String path1) {
		this.path1 = path1;
	}
	public String getPath2() {
		return path2;
	}
	public void setPath2(String path2) {
		this.path2 = path2;
	}
	public String getText1() {
		return text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
}
