package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Profesores {
	static ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	Scanner sc = new Scanner(System.in);
	
	public Profesores(){}
	
	public static ArrayList<Profesor> crearProfesores(Scanner sc){
		int opcion;
		System.out.println("¿Cuantos profesores son?: ");
		opcion = sc.nextInt();
		for (int a = 0; a < opcion; a++) {
		profesores.add(new Profesor(sc));
		}
		return profesores;
		}
	
}
