//java polymorphism example
package com.mateusborja.javadevanalyst.lesson_6_5;

public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador();
		LeiteQuente leite = new LeiteQuente();
		preparador.prepararBebida(leite);
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
		
		//add new variable cafe the type Cafe
		Cafe cafe = new Cafe();
		preparador.prepararBebida(cafe);
		
		//add new variable suconaturalthe type SucoNatural
		SucoNatural suconatural = new SucoNatural();
		preparador.prepararBebida(suconatural);
		
	}

}
