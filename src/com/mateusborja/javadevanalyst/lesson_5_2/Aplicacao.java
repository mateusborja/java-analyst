//java modifiers - acces modifier
package com.mateusborja.javadevanalyst.lesson_5_2;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		
		c1.setNumConta(54023);
		c1.setAtiva(true);
		
		c1.depositar(15);
		c1.sacar(500);
		
		double saldo = c1.getSaldo();
		
		System.out.println(saldo);
		
		
		
		
	}

}
