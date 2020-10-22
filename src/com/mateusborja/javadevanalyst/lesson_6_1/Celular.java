package com.mateusborja.javadevanalyst.lesson_6_1;

public class Celular extends Telefone {

	public void adicionarDDD(String ddd) {
		String n = ddd + this.numero;

	}

	public int telefonar(int n) {
		super.telefonar();
		return n;

	}

}
