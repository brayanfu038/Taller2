package view;

import java.util.Scanner;

public class View {
    Scanner console;
    public View(){
        console = new Scanner(System.in);
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
}

