package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestionador {
	
	private static ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	
	public Gestionador() {}

	public Gestionador(ArrayList<Matricula> matriculas) {
		Gestionador.matriculas = matriculas;
	}
	
	public static void setMatriculas(ArrayList<Matricula> matriculas) {
		Gestionador.matriculas = matriculas;
		}
	
	public static void addMatricula(Scanner sc){
		 int opcion;
		 System.out.println("¿que quieres realizar?");
		 System.out.println("añadir alumnos------------------------1");
		 System.out.println("añadir profesor-----------------------2");
		 System.out.println("crear una matricula-------------------3");
		 opcion = sc.nextInt();
		 switch (opcion) {
			 case 1:
				// 	matriculas.add(new Alumno(sc));
					ArrayList<Alumno> alumnoss = new ArrayList<Alumno>();
					alumnoss.add(new Alumno(sc));
					int opcionDescuento;
					 System.out.println("¿quiere aplicar un descuento a este alumno? 1 = si / 2 = no");
					 opcionDescuento = sc.nextInt();
							 switch (opcionDescuento){
							 			case 1:
							 					Matricula.descuentoFamiliaNumerosa(opcionDescuento);
							 					break;
							 			case 2:
							 				System.out.println("vale, una matricula sin descuento");
							 							 						
							 				break;
							 			default: System.out.println("1 = si / 2 = no");
							 					 break;
							 }
					 		
				
			
				 	break;
				 	
			 case 2:
				//	matriculas.add(new Profesor(sc));
				 	ArrayList<Profesor> profesor = new ArrayList<Profesor>();
					profesor.add(new Profesor(sc));
				 	break;
			 case 3:
				 	matriculas.add(new Matricula(sc));
				 	
			 default:
				 	break;
		 }
		 while(opcion != 0);
	}
	
	
	public static String formattedgestonado() {
		String gestionado =
				"\n*******************************************" +
				"\n*----------matricula----------*";
				for (int f = 0; f < matriculas.size(); f++) {
					gestionado += matriculas.get(f).formattedAsignatura() + "\n" 
				+ "--------------------------------------------------";
				}
				gestionado +=
				"\n*------------------FIN--------------------*";
				return gestionado;

	}
	
	
}
