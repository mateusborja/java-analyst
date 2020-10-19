//java recods
package com.mateusborja.javadevanalyst.lesson_5_5;

//
public class Aplicacao {

	public static void main(String[] args) {

		Quadrado q1 = new Quadrado(6);
		Quadrado q2 = new Quadrado(6);

		System.out.println(q1.calcularArea());
		System.out.println(q1);

		System.out.println(q1.equals(q2));

		Retangulo r1 = new Retangulo();
		System.out.println("Largura = " + r1.largura() + ", " + "Altura: " + r1.altura()); // java record give method

		// java record
		Retangulo r2 = Retangulo.create(6);
		System.out.println(r2);

	}

}
