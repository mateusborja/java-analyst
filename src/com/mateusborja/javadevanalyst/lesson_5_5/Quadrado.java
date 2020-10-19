package com.mateusborja.javadevanalyst.lesson_5_5;

//public record - transporte de atributos

public record Quadrado(double lado) {

	public double calcularArea() {
		return lado * lado;
	}


}
