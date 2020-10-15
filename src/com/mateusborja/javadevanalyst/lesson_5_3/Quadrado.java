//java constructor and methods
package com.mateusborja.javadevanalyst.lesson_5_3;

public class Quadrado {
	
	private double lado;
	
	
	public Quadrado () {
		this(5);
	}
	
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double calculcarArea() {
		return lado * lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	

}
