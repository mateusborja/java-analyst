//change parameters
package com.mateusborja.javadevanalyst.lesson_4_4;

public class Aplicacao {

	public static void main(String[] args) {

		Operacao o = new Operacao();
		Operacao o1 = new Operacao();
		Operacao s1 = new Operacao();

		// int x =10;
		// o.trocar(x);
		// System.out.println(x);

		Valor valor = new Valor();
		valor.v = 1120;

		o.alterarValor(valor);
		// System.out.println(valor.v);

		int z1 = 1200;
		int z2 = 1200;
		int soma1 = z1 + z2;
		
		int subtrai = z1 - z2;
		s1.subtrair(z1, z2);
		System.out.println(subtrai);
		
		s1.somar(z1, z2);
		System.out.println(soma1);

		o1.trocar1(z1);
		System.out.println(z1);

	}

}
