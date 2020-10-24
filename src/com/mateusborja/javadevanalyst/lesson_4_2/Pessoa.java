// lesson 4.2
package com.mateusborja.javadevanalyst.lesson_4_2;

public class Pessoa {

	String nome;
	String name;
	int numFigurinhas;

	public String returnName(String name) {
		return this.name;

	}

	// receber
	public void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;

	}

	// method dar
	void dar(int numFigurinhas, Pessoa p) {
		this.numFigurinhas -= numFigurinhas;
		p.numFigurinhas += numFigurinhas;
		// p.receber(numFigurinhas);

	}

}
