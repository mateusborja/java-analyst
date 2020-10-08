package com.mateusborja.lessons_3_6;
//switch expressions
public class Lesson_3_6 {
	
	public enum DiasdaSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA
	}
	
	public enum FinaisdeSemana {
		SABADO, DOMINGO
	}
	

	
	public static void main(String[] args) {
		//DiasdaSemana d = DiasdaSemana.SEGUNDA;
		DiasdaSemana d = DiasdaSemana.QUARTA;
		
		switch (d) {
		
		case SEGUNDA:
			System.out.println("1");
			break;
			
		case TERCA:
			System.out.println("2");
			
		}
		
		//switch expression
		switch (d) {
		case SEGUNDA -> System.out.println("seg");
		case TERCA -> System.out.println("2");
		default -> System.out.println("outro");
			
		}
		
		int i = switch(d) {
		case SEGUNDA -> 1;
		case TERCA -> 2;
		default -> 0;
		};
		
		System.out.println(i);
	}
		
}
