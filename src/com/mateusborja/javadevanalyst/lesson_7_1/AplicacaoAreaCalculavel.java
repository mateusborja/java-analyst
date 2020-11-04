//java interface - polimorphism
package com.mateusborja.javadevanalyst.lesson_7_1;

public class AplicacaoAreaCalculavel {

	public static void main(String[] args) {

		AreaCalculavel a = new Quadrado();
		a.calcularArea();
		
		AreaCalculavel c = new Circulo();
		c.calcularArea();

	}

}
