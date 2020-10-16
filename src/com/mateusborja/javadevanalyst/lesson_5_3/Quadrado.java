//java constructor and methods
package com.mateusborja.javadevanalyst.lesson_5_3;

public class Quadrado {
	
	//private double lado;
	
	//static attribute
	static double lado;
	
	static {
		lado = 5;
	}
	
	
	public Quadrado () {
		this(5);
	}
	
	
	public Quadrado(double lado) {
		Quadrado.lado = lado;
		//non static attribute
		//this.lado = lado;
	}
	
	public static double calcularArea(double lado) {
		return lado * lado;
	}


	public void setLado(double lado) {
		Quadrado.lado = lado;
		//non static attribute
		//this.lado = lado;
	}
	
	
	

}
