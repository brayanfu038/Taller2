package tools;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderBinaryText {
	private FileInputStream file;
	private DataInputStream reader;
	public ReaderBinaryText(String path) throws FileNotFoundException {
		file = new FileInputStream(path);
		reader = new DataInputStream(file);
	}
	
	public String ReadText() throws IOException {
		return reader.readUTF();
	}
	public void closeAll() throws IOException {
		reader.close();
	}
}
