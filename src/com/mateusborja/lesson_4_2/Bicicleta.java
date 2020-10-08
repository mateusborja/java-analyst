package com.mateusborja.lesson_4_2;

public class Bicicleta {

	String nome;
	int bikes;

	void tem(int bikes) {
		this.bikes += bikes;
	}

	void deu(int bikes, Bicicleta b) {
		this.bikes -= bikes;
		b.tem(bikes);

	}

}
