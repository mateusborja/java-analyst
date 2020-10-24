package com.mateusborja.javadevanalyst.lesson_6_5;

public class Agua extends Bebida {

	public Agua() {
		super("Agua", false);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando o copo");
		System.out.println("Colocando a " + getNome() + " no copo");
	}

}
