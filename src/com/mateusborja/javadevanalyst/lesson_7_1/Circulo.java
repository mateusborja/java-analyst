//java interface - class implementation 
package com.mateusborja.javadevanalyst.lesson_7_1;

public class Circulo implements AreaCalculavel{

	public double raio;
	
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

}
