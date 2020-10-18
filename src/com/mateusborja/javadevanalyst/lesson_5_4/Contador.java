package com.mateusborja.javadevanalyst.lesson_5_4;

public class Contador {

	private static int valor; // attribute static

	Contador() {
		valor = 1;
	}

	public static void incrementar() {
		valor++;
	}

	public static int getValor() {
		return valor;
	}

}
