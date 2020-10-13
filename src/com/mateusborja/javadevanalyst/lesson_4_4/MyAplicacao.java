//my examples change parameters for methods
package com.mateusborja.javadevanalyst.lesson_4_4;

public class MyAplicacao {

	public static void main(String[] args) {

		Operacao s1 = new Operacao();
		Valor valor = new Valor();

		int z1 = 1200;
		int z2 = 1200;
		int soma1 = z1 + z2;

		s1.somar(z1, z2);
		System.out.println(soma1);

		valor.z = 12;
		s1.mudarValor(valor);
		System.out.println(valor.z);

	}

}
