//java modifiers static
package com.mateusborja.javadevanalyst.lesson_5_4;


public class Aplicacao {
	
	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		int soma1 = m.somar(5, 10);
		int subtracao1 = m.subtratir(50, 10);
		
		int soma = Matematica.somar(10, 5);
		int subtracao = Matematica.subtratir(50, 10);
		
		
		System.out.println(soma);
		System.out.println(subtracao);
		
		
		
		
		
		
		
		
		
		
		
	}

}
