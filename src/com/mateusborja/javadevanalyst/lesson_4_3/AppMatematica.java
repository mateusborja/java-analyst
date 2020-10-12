package com.mateusborja.javadevanalyst.lesson_4_3;

public class AppMatematica {

	public static void main(String[] args) {

		Matematica m = new Matematica();

		int soma = m.somar(10, 20, 25);
		System.out.println(soma);
		
		double soma2 = m.somar(13.2, 12.3);
		System.out.println(soma2);

	}

}
