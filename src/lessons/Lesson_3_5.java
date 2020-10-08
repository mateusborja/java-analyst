package lessons;

//java if else and else if

public class Lesson_3_5 {
	public static void main(String[] args) {
		
		int num = 10;
		
		if (num > 10) {
			System.out.println("O número é maior que 10");
		
		} else if (num < 10) {
			System.out.println("O número é menor que 10");
			
		} else {
			System.out.println("O número é 10");
		}
		
		
		// no keys
		int num1 = 10;
		
		if (num1 > 10) 
			System.out.println("O número é maior que 10");
			
		else if (num1 < 10) 
			System.out.println("O número é menor que 10");
			
		else 
			System.out.println("O número é 10");
			System.out.println("\n" + "O número é 10 mesmo");
			
			
		int num2 = 15 ; 
		
		switch (num2) {
		
		case 5:
			System.out.println("O Número é 5");
		
		case 10:
			System.out.println("O Número é 10");
		
		case 12:
			System.out.println("O Número é 12");
	
		default:
			System.out.println("O Número é 15");
			break;
		
			}
		
		
		int num3 = 3;
		
		switch (num3) {
		
		case 1:
		case 2:
		case 3:
			System.out.println("O numéro é:" + "\n" + num3);
			break;
		case 4:
		case 5:
			System.out.println("O Número é 10");
			break;
				
		case 15:
			System.out.println("O Número é 15");
			break;

		default:
			System.out.println("O Número é outro");
			break;
		}
		
	}
	
}
