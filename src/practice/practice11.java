package practice;

//java break and continue
public class practice11 {
	public static void main(String[] args) {
		//brake control structure
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
		//continue control structure
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}

}
