//java constructor and methods
package com.mateusborja.javadevanalyst.lesson_5_3;

public class QR {
	
	//private double lado;
	
	//static attribute
	static double lado;
	
	static {
		lado = 5;
	}
	
	
	public QR () {
		this(5);
	}
	
	
	public QR(double lado) {
		QR.lado = lado;
		//non static attribute
		//this.lado = lado;
	}
	
	public static double calcularArea(double lado) {
		return lado * lado;
	}


	public void setLado(double lado) {
		QR.lado = lado;
		//non static attribute
		//this.lado = lado;
	}
	
	
	

}
