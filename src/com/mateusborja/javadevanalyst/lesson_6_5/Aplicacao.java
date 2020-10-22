//java polymorphism example
package com.mateusborja.javadevanalyst.lesson_6_5;

public class Aplicacao {

	public static void main(String[] args) {
		
		LeiteQuente leite = new LeiteQuente();
		Preparador preparador = new Preparador();
		preparador.prepararBebida(leite);
	}

}
