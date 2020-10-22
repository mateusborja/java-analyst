//java modifiers - acces modifier
package com.mateusborja.javadevanalyst.lesson_5_2;

public class AplicacaoContaBancaria {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria();

		c1.setNumConta(54023);
		c1.setAtiva(true);

		c1.depositar(150);
		c1.sacar(55);

		double saldo = c1.getSaldo();

		System.out.println(saldo);

	}

}
