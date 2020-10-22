//change parameters
package com.mateusborja.javadevanalyst.lesson_4_4;

public class AplicacaoOperacao {

	public static void main(String[] args) {

		Operacao o = new Operacao();
		Valor valor = new Valor();

		int x = 10;
		o.trocar(x);
		//System.out.println(x);

		valor.v = 1120;
		
		valor.v = 10.000000;

		//o.alterarValor(valor);
		System.out.println(valor.v);

	}

}
