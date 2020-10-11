/* classes
 * class Book
 * 
 * 
 */
package com.mateusborja.javadevanalyst.lesson_4_1;

public class Lesson_4_1 {

	String isbnString;
	String title;
	int numPaginas;

	void emprestar(int c) {

		Lesson_4_1 book1 = new Lesson_4_1();
		Lesson_4_1 book2 = new Lesson_4_1();
		Lesson_4_1 book3 = new Lesson_4_1();
		Lesson_4_1 book4 = new Lesson_4_1();

		book1.title = "Learn java";
		book1.numPaginas = 25;
		book1.title = book3.title;

		book2.isbnString = "1234";

		book3.isbnString = "4321";
		book3.numPaginas = 10;
		book3.title = "Jornal da Tarde";

		book4.numPaginas = 100;
		book4.title = book3.title;
		

		System.out.println(book3.title);

	}

	void devolver() {

		System.out.println();
	}

}
