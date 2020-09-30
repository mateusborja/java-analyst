package practice;

//implicit casting
public class practice3 {
	public static void main(String[] args) {
		long n1 = 10; // int for long variable type
		
		float n2 = 5L; // long for float variable type
		
		double n3 = 2.4f; // float for a double variable type
		
		//wrong casting;
		//int n4 = 3.4;
		
		// variable type double for varible type int not possible
		/*double d = 100.0;
		int i = d; */ 
		
		double d = 100.00;
		int i = (int) d;
		
		double e = 100;
		int f = (int) e;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(d);
		System.out.println(i);
		System.out.println(e);
		System.out.println(f);
		
	}

}
