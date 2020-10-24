package com.mateusborja.javadevanalyst.lesson_6_5;

public class Preparador {

	public void prepararBebida(Bebida bebida) {

		System.out.println("Preparando a bebida " + bebida.getNome());
		bebida.preparar();

		// specify for class LeiteQuente
		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}

		System.out.println("A bebida " + bebida.getNome() + " foi preparada com sucesso. ");
		System.out.println("Agora você pode beber seu " + bebida.getNome() + " a vontade...\n");

	}

}
