package com.zubiri.matriculas;

import java.util.Scanner;

public class Profesor extends Persona {
	
	String titulacion;
	String departamento;
	
	public Profesor(){}
	
	public Profesor (String dni, String nombre, String apellido, String titulacion, String departamento){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulacion = titulacion;
		this.departamento = departamento;

	}
	public Profesor (Scanner sc){
		super(sc);
		
		try {
			this.setTitulacion(titulacion);
			System.out.println("que titulacion tiene el profe?:");
			this.setTitulacion(sc.next());
		}
		catch(Exception e){System.out.println("aqui hay un error" + e);}
		System.out.println("en que departamento esta?:");
		this.setDepartamento(sc.next());
	}
	
	public String getTitulacion() {
	return titulacion;
	}
	
	public void setTitulacion(String titulacion) throws Exception  {
		if (titulacion == null)
		{ System.out.print("tiene que tener una titulacion");}
		else	
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String formattedPersona() {
		String profesor =
				super.formattedPersona()+
				"\ntitulacion :\t" + this.getTitulacion() + "\n"
				+"departamento :\t" + this.getDepartamento() + "\n";
				return profesor;
	}
	
}
