//java constructor
package com.mateusborja.javadevanalyst.lesson_5_3;

public class Aplicacao {

	public static void main(String[] args) {

		// instance Retangulo Class
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo(15, 135);
		Retangulo r3 = new Retangulo();

		double arear1 = r1.calcularArea();
		double arear2 = r2.calcularArea();

		r3.setValores(15, 25);
		double arear3 = r3.calcularArea();

		System.out.println(arear1 + " square meters");
		System.out.println(arear2 + " sqm");
		System.out.println(arear3 + " square meters");

		// instance Quadrado class
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();

		double areaq1 = q1.calculcarArea();

		q2.setLado(25);

		double areaq2 = q2.calculcarArea();

		System.out.println(areaq1 + " meters");
		System.out.println(areaq2 + " meters");

	}

}
