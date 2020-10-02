package lessons;

//java loop while, do while and for 
public class lesson_3_7 {
	public static void main(String[] args) {
		int x = 0;
		
		while (x <= 10) {
			System.out.println(x);
			x++;
		}
		
		System.out.println("\n" + x);
		
		//break
		while (true) {
			System.out.println(x);
			
			if (x == 10) {
				break;
			}
			
			x++;
		}
		
		
	}

}
