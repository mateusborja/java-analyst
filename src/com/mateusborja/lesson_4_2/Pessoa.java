// lesson 4.2
package com.mateusborja.lesson_4_2;

public class Pessoa {

	//
	String nome;
	String name;
	int numFigurinhas;

	/*
	 *  method receber 
	 */
	


	public String returnName(String name) {
		return this.name;
				
	}
	
	
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
