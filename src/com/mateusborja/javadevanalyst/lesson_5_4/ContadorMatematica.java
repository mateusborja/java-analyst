package com.mateusborja.javadevanalyst.lesson_5_4;

public class ContadorMatematica {

	private static int valor; // attribute static

	ContadorMatematica() {
		valor = 1;
	}

	public static void incrementar() {
		valor++;
	}

	public static int getValor() {
		return valor;
	}

}
