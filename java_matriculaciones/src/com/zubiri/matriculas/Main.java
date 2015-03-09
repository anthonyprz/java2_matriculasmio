package com.zubiri.matriculas;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		
		
		 int opcionMain;
		 System.out.println("¿quieres gestionar?-----1");
		 System.out.println("o");
		 System.out.println("mostrar datos-----------2");
		 System.out.println("salir------------------ 3");
		 
		 opcionMain = sc.nextInt();
		 switch (opcionMain) {
		 case 1:
			 Gestionador.addMatricula(sc);
			 break;
		 case 2:
			 Gestionador.formattedgestonado();
			 break;
		 case 3:
			 System.out.println("gracias por usar el programa");
			break;
		 }
		 while(opcionMain != 0);
		 
		 
	}

}
