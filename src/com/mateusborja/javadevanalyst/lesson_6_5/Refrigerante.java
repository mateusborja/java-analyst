package com.mateusborja.javadevanalyst.lesson_6_5;

public class Refrigerante extends Bebida {
	
	Refrigerante(){
		super("Refrigerante", false);
	}
	
	@Override
	public void preparar() {
		System.out.println("\nPegando o copo");
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o refrigerante");
	}

}
