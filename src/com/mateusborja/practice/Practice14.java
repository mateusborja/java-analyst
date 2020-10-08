package com.mateusborja.practice;
//switch expressions
public class Practice14 {
	public enum DiasdaSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA
	}
	
	public enum FinaisdeSemana {
		SABADO, DOMINGO
	}
	
	public static void main(String[] args) {
		DiasdaSemana d = DiasdaSemana.SEGUNDA;
		FinaisdeSemana f = FinaisdeSemana.DOMINGO;
		
		switch (d) {
		case TERCA: 
			System.out.println(2);
			System.out.println("ter");
			break;
		
		case SEGUNDA:
			System.out.println(1);
			System.out.println("seg");
			break;
		
		default:
			System.out.println("Outro dia");
		}
		
		switch (f) {
		
		case SABADO:
			System.out.println(6);
			System.out.println("sab");
			break;
		
		case DOMINGO:
			System.out.println(7);
			System.out.println("dom");
			break;
		
		default: 
			System.out.println("outro dia");
		
		}
		
		int i = switch (f) {
		case SABADO -> 1;
		case DOMINGO -> 2;
		default -> 0;
		};
		
		System.out.println(i);
			
	}

}
