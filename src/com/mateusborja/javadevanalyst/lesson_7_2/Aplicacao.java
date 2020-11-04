//java abstract class example
package com.mateusborja.javadevanalyst.lesson_7_2;

public class Aplicacao {

	public static void main(String[] args) {

		Diamante d = new Diamante();
		d.pegar();

		Cogumelo c = new Cogumelo();
		c.pegar();

		Moeda m = new Moeda();
		m.pegar();
		
		Maca maca1 = new Maca();
		maca1.pegar();
		
		Item maca2 = new Maca(); //using class to reference object
		maca2.pegar();
		
		

	}

}
