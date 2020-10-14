/*java modifiers - acces modifier
 * and methods get
 * method set 
 */
package com.mateusborja.javadevanalyst.lesson_5_2;

public class ContaBancaria {

	// int numConta;
	// boolean ativa;
	// double saldo;

	private int numConta;
	private boolean ativa;
	private double saldo;
	
	//rules
	public void sacar(double saque) {
		saldo-= saque;
	}
	
	//rules
	public void depositar(double deposito) {
		saldo+= deposito;
	}
	

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		//rules
		if (numConta > 0) {
			this.numConta = numConta;
		}
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public double getSaldo() {
		return saldo;
	}

	//rulle not visible in this case
	//public void setSaldo(double saldo) {
		//this.saldo = saldo;
	//}

}
