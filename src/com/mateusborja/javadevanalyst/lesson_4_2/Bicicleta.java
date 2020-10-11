package com.mateusborja.javadevanalyst.lesson_4_2;

public class Bicicleta {

	String nome;
	int bikes;

	void recebeu(int bikes) {
		this.bikes += bikes;
	}

	void deu(int bikes, Bicicleta b) {
		this.bikes -= bikes;
		b.recebeu(bikes);

	}

}
