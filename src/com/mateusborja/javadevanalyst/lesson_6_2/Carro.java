package com.mateusborja.javadevanalyst.lesson_6_2;

public class Carro extends Veiculo {
	
	private boolean quatroPortas;

	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Portas: 04 portas");
		System.out.println("Quatro portas: " + quatroPortas);
	}
	
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	

}
