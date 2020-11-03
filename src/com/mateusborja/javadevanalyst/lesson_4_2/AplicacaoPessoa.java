//main method
package com.mateusborja.javadevanalyst.lesson_4_2;

public class AplicacaoPessoa {

	public static void main(String[] args) {

		// pessoa1
		Pessoa p1 = new Pessoa();
		// p1 = new Pessoa();

		// pessoa2
		Pessoa p2 = new Pessoa();
		// p1 = new Pessoa();

		Pessoa m1 = new Pessoa();
		Pessoa m2 = new Pessoa();

		m1.name = "Felipe Saldanha";
		m1.receber(25);
		m1.dar(15, p2);

		m2.name = "Fredson";
		m2.receber(10);
		m2.dar(3, m1);

		p1.nome = "José";
		p2.nome = "Maria";

		p1.receber(5);
		p1.receber(7);

		p1.dar(2, p2);
		p2.dar(1, p1);

		System.out.println(p1.nome + " => " + p1.numFigurinhas + " figurinhas ");
		System.out.println(p2.nome + " => " + p2.numFigurinhas + " figurinhas ");
		System.out.println(m1.name + " => " + m1.numFigurinhas + " figurinhas ");
		System.out.println(m2.name + " => " + m2.numFigurinhas + " figurinhas ");

	}
}