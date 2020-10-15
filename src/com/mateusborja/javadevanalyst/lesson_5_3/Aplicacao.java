//java constructor
package com.mateusborja.javadevanalyst.lesson_5_3;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo(15, 135);
		Retangulo r3 = new Retangulo();
		
		double arear1 = r1.calcularArea();
		double arear2 = r2.calcularArea();
		
		r3.setValores(15, 25);
		double arear3 = r3.calcularArea();
		
		
		
		
		
		
		
		
		
		
		System.out.println(arear1);
		System.out.println(arear2);
		System.out.println(arear3);
		
		
		
		
	} 
	

}
