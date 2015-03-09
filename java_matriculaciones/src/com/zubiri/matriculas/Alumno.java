package com.zubiri.matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
	
	int añoInscripcion = -1;
	
	public Alumno (){}
	String ciclo = null;
	
	public Alumno (String dni, String nombre, String apellido, int añoInicio){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.añoInscripcion = añoInicio;
	}
	Alumno (Scanner sc){
		super(sc);
		System.out.println("dime el año de inscripcion:");
		this.setAñoInscripcion(sc.nextInt());
	}
		
	//Matriculas realizadas a lo largo de los a�os en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;
	
	public int getAñoInscripcion() {
		return añoInscripcion;
	}
	
	public void setAñoInscripcion(int añoInscripcion) {
		this.añoInscripcion = añoInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public  String formattedPersona() {
		String alumno =
				
				super.formattedPersona()+
				"\nel DNI:\t" + this.getAñoInscripcion() + "\n";
				return alumno;
	}

}
