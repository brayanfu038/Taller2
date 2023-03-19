package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class View {
    Scanner console;
    public View(){
        console = new Scanner(System.in);
    }
    public boolean  isOerwritten(String message) {
    	boolean value;
    	int confirmado = JOptionPane.showConfirmDialog(
    			   null,message);

    			if (JOptionPane.OK_OPTION == confirmado) {
    			   value = false;
    			}else {
    			   value= true;
    			}
    			return value;
    	
    }
	public void showGrapichMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public String readData(String message) {
		String data = JOptionPane.showInputDialog(null, message);
		return data;
	}
	public String  selection() {
		String seleccion = (String) JOptionPane.showInputDialog( null,"Seleccione el tipo de archivo","Seleccione opcion",JOptionPane.QUESTION_MESSAGE,
				 	null,  // null para icono defecto
				   new String[] { "TXT", "BINARIO"}, 
				   "opcion 1");
		return  seleccion;
	}
    public int readInt(String message) {
        System.out.println(message);
        return console.nextInt();
    }
    public String readString(String message) {
        System.out.println(message);
        return console.next();
    }
    public String menu(){
        String str= "1) Mostrar el contenido de un archivo sin espacios \n"
                +"2)Salir\n";
       return str;
    }
    public  void showMessageInt(int x){
        System.out.println(x);
    }
    public void showMessage(String str){
        System.out.println(str);
    }
    public long readLong(String message) {
    	System.out.println(message);
    	return console.nextLong();
    }
    public static void main(String[] args) {
		View view = new View();
		System.out.println(view.selection());
	}
}

