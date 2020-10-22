package com.mateusborja.javadevanalyst.lesson_6_1;

public class AppTelefone {

	public static void main(String[] args) {

		Celular c1 = new Celular();

		c1.setNumero(123);
		int num = c1.telefonar(123);
		
		System.out.printf("%n", num);

	}

}
