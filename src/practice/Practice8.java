package practice;

//java if else
public class Practice8 {
	public static void main(String[] args) {
		int x = 50;
		boolean r;
		
		if (x > 30) {
			r = true;
		} else {
			r = false;
		}
		
		//ternary operator
		r = x > 30 ? true : false;
		
		System.out.println(x);
		System.out.println(r);
		
	}
}
