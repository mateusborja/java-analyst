package com.mateusborja.javadevanalyst.lesson_6_5;

public class Cafe extends Bebida {
	

	Cafe() {
		super("Café", true);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando copo de café");
		System.out.println("Colocando o café no copo...");
	}

}
