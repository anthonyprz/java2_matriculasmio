package com.zubiri.matriculas;

import java.util.Scanner;

public class Matricula extends Asignatura {
	
	int añoMatriculacion;
    static double precio;
    
    
    
    Alumno alumno = new Alumno();
   
    public Matricula(){}
    
    public Matricula (String nombre, int creditos, Profesor profesor, int añoMatriculacion, double precio){
    	this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
		this.añoMatriculacion = añoMatriculacion;
		precio = precio;
    }
    public Matricula (Scanner sc){
    	super(sc);
    	System.out.println("dime el año de matriculacion");
		this.setAñoMatriculacion(sc.nextInt());
		System.out.println("dime el el precio");
		this.setPrecio(sc.nextDouble());
    }
	public int getAñoMatriculacion() {
		return añoMatriculacion;
	}
	public double getPrecio() {
		return precio;
	}
	
	public void setAñoMatriculacion(int añoMatriculacion) {
		this.añoMatriculacion = añoMatriculacion;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	
	/**
	 * M�todo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matr�cula.
	 * @return
	 */
	public static double descuentoFamiliaNumerosa(double porcentaje) {
		
		return porcentaje = ((precio*25)/100);
	}
	
	public  String formattedAsignatura() {
		String matricula =
				super.formattedAsignatura() +
				"\naño de la matriculacion :\t" + this.getAñoMatriculacion() + "\n"
				+"precio :\t" + this.getPrecio() + "\n";
				return matricula;
	}
	
	
}
