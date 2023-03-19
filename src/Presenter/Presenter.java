package Presenter;

import java.io.File;
import java.io.IOException;

import model.FileManager;
import view.View;

public class Presenter {
	FileManager manager;
	View view;
	public static void main(String[] args) throws IOException {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
	public void Run() throws IOException {
		String aux;
		view = new View();
		manager = new FileManager();
		manager.readFirstPath(view.readData("Ingrese la primera ruta"));
		manager.readSecondPath(view.readData("Ingrese la segunda ruta"));
		aux=view.selection();
		String destination=manager.combinatePaths(aux);
		switch (aux) {
		case "TXT":
			if(manager.ValidateExistence(destination)) {
				manager.WriteTextFile(destination, view.isOerwritten("¿Desea borrar el expediente?"));
			}else {
				manager.WriteTextFile(destination);
			}
			break;
		case "BINARIO":
			if(manager.ValidateExistence(destination)) {
				manager.writerBinaryFile(destination, view.isOerwritten("¿Desea borrar el expediente?"));
			}else {
				manager.writerBinaryFile(destination);
			}
			break;
		default:
			break;
		}
	}
}
