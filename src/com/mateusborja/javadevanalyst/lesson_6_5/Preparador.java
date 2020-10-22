package com.mateusborja.javadevanalyst.lesson_6_5;

public class Preparador {

	public void prepararBebida(Bebida bebida) {

		System.out.println("Preparando a bebida " + bebida.getNome());
		bebida.preparar();

		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}

		System.out.println("A bebida foi preparada com sucesso.");

	}

}
