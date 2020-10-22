//java polymorphism
package com.mateusborja.javadevanalyst.lesson_6_4;

public class Aplicacao {

	public static void main(String[] args) {

		Animal a = new Cachorro(); // subclasse same superclasse // Cachorro c = new Cachorro(); >> polymorphism
		a.falar();

		// use instanceof
		if (a instanceof Cachorro) {

			Cachorro c = (Cachorro) a; // casting explicit
			c.morder();
		}

		Cachorro c = new Cachorro();
		Gato g = new Gato();

		falar(c);
		falar(g);

	}

	private static void falar(Animal a) {
		a.falar();

	}

}
