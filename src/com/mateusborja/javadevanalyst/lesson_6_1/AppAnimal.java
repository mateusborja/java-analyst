//java inheritance and polymorphism
package com.mateusborja.javadevanalyst.lesson_6_1;

public class AppAnimal {

	public static void main(String[] args) {

		Animal a1 = new Cachorro();
		a1.falar();

		Animal a2 = new Gato();
		a2.falar();

		Animal a3 = new Vaca();
		a3.falar();

		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();

		Animal a4 = (Animal) c1; // casting
		a4.falar();

		Animal a = new Cachorro();
		Cachorro c3 = (Cachorro) a; 
		c3.morder(); // metodo invocado pelo objeto
		
		

	}

}
