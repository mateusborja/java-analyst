package practice;
//java while, do-while, for

public class Practice10 {
	public static void main(String[] args) {
		int idade = 15;
		String end = "end code execution";
		
		while (idade < 18) {
			System.out.println(idade);
			idade = idade + 1;
			
		}
		
		System.out.println(end);
		
		int contador = 10;
		
		//do while declaration
		do {
			System.out.println(contador);
			contador = ++contador; 
			
		} while (contador < 20); //variable contador equal 21
		
		
		//for declaration
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
//		for (;;)
//		System.out.println("Infinity Loop");
		
	}
}
