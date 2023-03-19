
package tools;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTextFile{
	private File file;
	private FileWriter fw;
	private BufferedWriter bw; 
	
	public WriterTextFile(String path) throws IOException {
		file = new File(path);
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
	}
	public WriterTextFile(String path,boolean decision) throws IOException {
		file = new File(path);
		fw = new FileWriter(file,decision);
		bw = new BufferedWriter(fw);
	}
	
	public void toWriter(String value) throws IOException {
		bw.write(value);
		bw.close();
	}
}