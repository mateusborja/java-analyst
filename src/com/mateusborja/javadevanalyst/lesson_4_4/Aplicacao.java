//change parameters
package com.mateusborja.javadevanalyst.lesson_4_4;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Operacao o = new Operacao();
		
		//int x =10;
		//o.trocar(x);
		//System.out.println(x);
		
		Valor valor = new Valor();
		valor.v = 1120;
		
		
		o.alterarValor(valor);
		System.out.println(valor.v);
		
	}

}
