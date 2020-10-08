//main method

package com.mateusborja.lesson_4_2;

public class AplicacaoBicicleta {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		Bicicleta b1 = new Bicicleta();
		Bicicleta b2 = new Bicicleta();

		p1.nome = "Henrique";
		p2.nome = "Pedro";
		
		b1.recebeu(100);
		b1.recebeu(20);
		
		
		b1.deu(70, b2);
		
		
		System.out.println(" O " + p1.nome + " tem " + b1.bikes);
		
	}

}
