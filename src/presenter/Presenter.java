package presenter;

import java.io.IOException;

import model.TextFileManager;
import view.View;

public class Presenter {
	View view;
	TextFileManager fileManager;
	
	public Presenter() {
	}
	
	public static void main(String[] args) throws IOException {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
	
	public void Run() throws IOException {
	 view = new View();
	 String path;
	 int opcion = view.readInt(view.menu());
	 switch (opcion) {
	case 1:
		path = view.readString("Ingrese el path del archivo:\n");
		fileManager = new TextFileManager(path);
		view.showMessage("\n"+fileManager.readTextFile());
		fileManager.closeFile();
		break;
	case 2:
		view.showMessage("gracias por usar nuestros servicios");
		break;
	default:
		
		break;
	 	}
	}
	
}
