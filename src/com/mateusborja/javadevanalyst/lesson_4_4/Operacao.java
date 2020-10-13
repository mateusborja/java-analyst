package com.mateusborja.javadevanalyst.lesson_4_4;

public class Operacao {

	private int soma;
	private int subtrai;

	void trocar(int n) {
		n = 20;
	}

	void alterarValor(Valor valor) {
		valor = new Valor();
		valor.v = 20;

	}

	void trocar1(int z) {
		z = 45;
	}

	void somar(int x, int z) {
		soma = x + z;
	}

	void subtrair(int x, int z) {
		subtrai = x - z;
	}

	void mudarValor(Valor valor) {
		valor = new Valor();
		valor.z = 150;
	}

}
