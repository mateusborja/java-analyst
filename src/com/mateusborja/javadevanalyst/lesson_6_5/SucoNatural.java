package com.mateusborja.javadevanalyst.lesson_6_5;

public class SucoNatural extends Bebida {

	SucoNatural() {
		super("Suco Natural", false);
	}

	@Override
	public void preparar() {
		System.out.println("Pegando o copo...");
		System.out.println("Colocando o suco no copo...");
		System.out.println("Adoçando o suco");
	}

}
