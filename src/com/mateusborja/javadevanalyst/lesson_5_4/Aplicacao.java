//java modifiers static
package com.mateusborja.javadevanalyst.lesson_5_4;

public class Aplicacao {

	public static void main(String[] args) {

		Matematica m = new Matematica();

		int soma = m.somar(5, 10);
		int subtracao = m.subtrair(50, 10);

		int soma1 = Matematica.somar(10, 5);
		int subtracao1 = Matematica.subtrair(50, 10);

		System.out.println(soma);
		System.out.println(subtracao);

		System.out.println(soma1);
		System.out.println(subtracao1);

	}

}
