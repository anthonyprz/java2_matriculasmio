package com.zubiri.matriculas;

import java.util.Scanner;

public class Asignatura {

	String nombre;
	int creditos;
	Profesor profesor;
	
	public Asignatura(){}
	
	public Asignatura(String nombre, int creditos, Profesor profesor){
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	public Asignatura(Scanner sc){
		System.out.println("dime el nombre de la asignatura");
		this.setNombre(sc.next());
		System.out.println("dime los creditos:");
		this.setCreditos(sc.nextInt());
		try{
		this.setProfesor(profesor);
		System.out.println("quien es el profesor?");
		this.setProfesor(new Profesor(sc));
		}
		catch(Exception e){System.out.println("aqui hay un error" + e);}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor)  throws Exception {
		if(profesor == null){
			System.out.println("en la clase tiene que haber un profesor");
		}
		else
		this.profesor = profesor;
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public  String formattedAsignatura() {
		String asignatura =
				"\nnombre de la asignatura :\t" + this.getNombre() + "\n"
				+"numero de creditos :\t" + this.getCreditos() + "\n"
				+ profesor.formattedPersona();
				return asignatura;
	}
	
	/**
	 * M�todo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		
	}

}
