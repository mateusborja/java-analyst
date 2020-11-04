package com.mateusborja.javadevanalyst.lesson_7_3;

public class Vendedor {

	public void mostrarPreco(ItemCaro item) {
		System.out.printf("O valor é => R$ %.2f%n", item.getPreco());
	}

	public void mostraPreco(ItemBarato item) {
		System.out.printf("O valor é => R$ %.2f%n", item.getPreco());

	}

}
