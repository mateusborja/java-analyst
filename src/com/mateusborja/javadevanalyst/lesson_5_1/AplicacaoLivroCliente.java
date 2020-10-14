//java oop and methods getters and setters
package com.mateusborja.javadevanalyst.lesson_5_1;

public class AplicacaoLivroCliente {

	public static void main(String[] args) {

		Livro l1 = new Livro("", 0);

		l1.setIsbn("L-3230-RG");
		System.out.println(l1.getIsbn());

	}

}
