//java recods
package com.mateusborja.javadevanalyst.lesson_5_5;

//
public class AplicacaoQuad {

	public static void main(String[] args) {

		Quad q1 = new Quad(6);
		Quad q2 = new Quad(6);

		System.out.println(q1.calcularArea());
		System.out.println(q1);

		System.out.println(q1.equals(q2));

		Ret r1 = new Ret();
		System.out.println("Largura = " + r1.largura() + ", " + "Altura: " + r1.altura()); // java record give method

		// java record
		Ret r2 = Ret.create(6);
		System.out.println(r2);

	}

}
