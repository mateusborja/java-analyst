//main method
package com.mateusborja.lesson_4_2;

public class AplicacaoPessoa {
	public static void main(String[] args) {
		
		//pessoa1
		Pessoa p1 = new Pessoa();	
		//p1 = new Pessoa();
		
		//pessoa2
		Pessoa p2 = new Pessoa();	
		//p1 = new Pessoa();
		
		p1.nome = "José";
		p2.nome = "Maria";
		
		p1.receber(5);
		p1.receber(7);
		
		p1.dar(2, p2);
		p2.dar(1, p1);
		
		
		
		System.out.println(p1.nome + " => " + p1.numFigurinhas + " figurinhas ");
		System.out.println(p2.nome + " => " + p2.numFigurinhas + " figurinhas ");
		
	}

}
