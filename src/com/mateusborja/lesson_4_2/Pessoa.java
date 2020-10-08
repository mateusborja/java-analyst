// lesson 4.2
package com.mateusborja.lesson_4_2;

public class Pessoa {

	//
	String nome;
	int numFigurinhas;

	/*
	 *  method receber 
	 */
	
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;

	}
	
	/*
	 * method dar
	 * 
	 */

	void dar(int numFigurinhas, Pessoa p) {
		this.numFigurinhas -= numFigurinhas;
		p.numFigurinhas += numFigurinhas;
		//p.receber(numFigurinhas);
		

	}

}
