//java polymorphism
package com.mateusborja.javadevanalyst.lesson_6_4;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Animal a = new Cachorro(); // subclasse same superclasse // Cachorro c = new Cachorro(); >> polymorphism
		a.falar();
		
		Cachorro c = (Cachorro) a; // casting explicit
		c.morder();
		
		
		
		
		
		
		
		
	}

}
