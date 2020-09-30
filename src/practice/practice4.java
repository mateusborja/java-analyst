package practice;

public class practice4 {
	public static void main(String[] args) {
		//explicit casting
		/* 00000000 00000000 00000000 01100100 / binary int representation int value 100
		 * significant byte number first 0 = 100,
		 * 10000000 00000000 00000000 01100100 
		 *  significant byte number first 1 = -100
		 */
		int h = -100;
		int i = 100; 
		System.out.println(h);
		
		//explicit casting
		/* 00000000 01100100 / binary int representation int value 100
		 * significant byte number first 0 = 100, 
		 */
		
		short s = (short) i;
		System.out.println(s);
		
		//explicit casting
		/* 11111111 11111111 11111111 10011100 / binary int representation int value -100
		 * significant byte number first 1 = -100,
		*/
		
		i = -100;
		s = (short) i;
		System.out.println(s);
		
		//explicit casting
		/*  11111111 10011100 / binary int representation int value -100
		 * significant byte number first 1 = -100,
		*/
	
	}

}
