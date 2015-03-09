package com.zubiri.matriculas;

import java.util.Scanner;

public abstract class Persona {
	
	String dni;
	String nombre;
	String apellido;
	
	public Persona (){}
	
	public Persona ( String dni, String nombre, String apellido){
		this.dni = dni;	
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona (Scanner sc){
		try{
			
			System.out.println("dime el dni de la persona:");
			this.setDni(sc.next());	
		//	this.setDni(dni);
		}
		catch(Exception e){System.out.println("aqui hay un error" + e);} 		
		System.out.println("dime el nombre de la persona:");
		this.setNombre(sc.next());
		System.out.println("dime el apellido de la persona:");
		this.setApellido(sc.next());
	}
	

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) throws Exception {
		
		if(dni.length() != 9){
			System.out.println("el dni tiene que tener 9 digitos");
		}
			this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public  String formattedPersona() {
		String persona =
				"\nel DNI:\t" + this.getDni() + "\n"
				+ "nombre:\t" + this.getNombre() + "\n"
				 + "apellido:\t" + this.getApellido() + "\n";
				return persona;
	}
	
	/**
	 * M�todo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		
	}
}
