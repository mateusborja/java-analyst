package com.mateusborja.javadevanalyst.lesson_6_5;

public class LeiteQuente extends Bebida {
	
	public LeiteQuente() {
		super("Leite Quente", true);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando o copo...");
		System.out.println("Colocando o leite no copo..");
	}

}
