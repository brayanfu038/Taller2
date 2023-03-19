package tools;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriterBinaryFile {
	private FileOutputStream file;
	private DataOutputStream writer;
	public WriterBinaryFile(String path) throws FileNotFoundException {
		file = new FileOutputStream(path);
		writer = new DataOutputStream(file);
	}
	public WriterBinaryFile(String path,boolean decision) throws FileNotFoundException {
		file = new FileOutputStream(path,decision);
		writer = new DataOutputStream(file);
	}
	public void writeText(String text) throws IOException {
		writer.writeUTF(text);
		writer.close();
	}
	public static void main(String[] args) throws IOException {
		 WriterBinaryFile writer = new  WriterBinaryFile("Resources\\texto1.bin");
		 writer.writeText("Contenido del archivo binario");
	}
	
}
