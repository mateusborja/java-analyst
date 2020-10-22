//java record
package com.mateusborja.javadevanalyst.lesson_5_5;

public record Ret(double largura, double altura) {

	public Ret() {
		this(4, 3);
		// this.largura = 4;
		// this.altura = 3;
	}

	public double calcularArea() {
		return largura * altura;
	}

	public static Ret create(double lado) {
		return new Ret(lado, lado);
	}

}
