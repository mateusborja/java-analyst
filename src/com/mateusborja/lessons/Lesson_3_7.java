package com.mateusborja.lessons;

//java loop while, do while and for 
public class Lesson_3_7 {
	public static void main(String[] args) {
		int x = 0;
		
		while (x <= 10) {
			System.out.println(x + "\n");
			x++;
		}
		
		int y = 0;
		
		do {
			y++;
			System.out.println(y);
			
		} while (y < 10);
		System.out.println(x);
	}

}
