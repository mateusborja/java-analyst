//java methods and java attributes
package com.mateusborja.javadevanalyst.lesson_5_1;

public class Livro {

	// attributes static
	private static String livro1 = "Romeu e Julieta";

	private String isbn;
	private int numPaginas;

	public Livro() {

	}

	public Livro(String isbn, int numPaginas) {
		this();
		this.isbn = isbn;
		this.numPaginas = numPaginas;
	}

	public void emprestar(Cliente cliente) {
		// cliente = new Cliente();
		cliente.homem = 100;

	}

	public void devolver() {

	}

	private static String getLivro() {
		return Livro.livro1;
	}

	public String getIsbn() {
		System.out.println("O ISBN do Livro é: =>");
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

}
