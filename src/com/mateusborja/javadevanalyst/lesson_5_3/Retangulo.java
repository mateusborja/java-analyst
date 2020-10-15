package com.mateusborja.javadevanalyst.lesson_5_3;

public class Retangulo {
	
	private double altura;
	private double largura;
	
	

	/*
	 *  this() calls to second constructor
	 */
	
	//java constructor
	public Retangulo() {
		this(4,3);
		//largura = 4;
		//altura = 3;
	}
	
	//java constructor
	public Retangulo (double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	
	public double calcularArea() {
		return altura * largura;
	}

}
