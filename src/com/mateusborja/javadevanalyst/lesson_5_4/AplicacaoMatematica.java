//java modifiers static
package com.mateusborja.javadevanalyst.lesson_5_4;

public class AplicacaoMatematica {

	public static void main(String[] args) {

		Matematica m = new Matematica();

		int soma = m.somar(5, 10);
		int subtracao = m.subtrair(50, 10);

		int soma1 = Matematica.somar(10, 5);
		int subtracao1 = Matematica.subtrair(50, 10);

		System.out.println(soma);
		System.out.println(subtracao);

		System.out.println(soma1);
		System.out.println(subtracao1);
		
		
		ContadorMatematica c1 = new ContadorMatematica(); // Contador nessa classe o atributo esta do tipo static
		ContadorMatematica c2 = new ContadorMatematica(); // o atributo esta do tipo static
		ContadorMatematica c3 = new ContadorMatematica(); // o atributo esta do tipo static
		
		///c1.incrementar();
		///c2.incrementar();
		///c3.incrementar();
		
		ContadorMatematica.incrementar(); // increment one time
		ContadorMatematica.incrementar();
		
		System.out.println(ContadorMatematica.getValor());
		
		double media = ConstantesMatematica.MEDIA_DA_PROVA;
		
		System.out.println(media);
		
		
		

	}

}
