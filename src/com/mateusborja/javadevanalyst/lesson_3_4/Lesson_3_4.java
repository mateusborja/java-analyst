package com.mateusborja.javadevanalyst.lesson_3_4;
//type casting
public class Lesson_3_4 {
	public static void main(String[] args) {
		
		int x = 10; // not casting
		
		//long y = 10; //casting implicit (value 10 is whole number no output
		
		long y = 10L;
		
		double z = 10; // 
		
		float w = 10;
		System.out.println(x +"\n\n" + y + "\n\n" + z + "\n\n" + w);
		
		byte o = (byte) 130; // casting 
		System.out.println("\n" + o);
		
	
	}
}
