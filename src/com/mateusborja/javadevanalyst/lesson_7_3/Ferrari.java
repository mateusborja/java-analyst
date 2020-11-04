package com.mateusborja.javadevanalyst.lesson_7_3;

public class Ferrari implements Carro, ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a => Esquerda");

	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a => Direita");

	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari virou a => Acelerou");

	}

	@Override
	public void frear() {
		System.out.println("Ferrari => Freou");

	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari => Abriu a porta");

	}

	@Override
	public double getPreco() {
		return 100000;
	}






}
