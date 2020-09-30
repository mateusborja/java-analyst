package practice;

//increment operators

public class practice2 {

	public static void main(String[] args) {
		int x = 10;
		x++;
		System.out.println(x);
		
		
		int y = 20;
		++y;
		System.out.println(y);
		
		// ++x and x++ the ordem increment (incremento e atribuição)
		int z = 10;
		int w = ++z; // z = 11, w = 11;
		System.out.println(w);
		System.out.println(z);
		
		int a = 10;
		int b = a++; // a = 11, b = 10;
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
