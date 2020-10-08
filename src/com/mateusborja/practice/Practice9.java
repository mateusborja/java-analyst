package com.mateusborja.practice;

//java switch
public class Practice9 {
	public static void main(String[] args) {
		int i = 10;
		
		switch (i) {

		case 1: {
			if(i < 10) {
			System.out.println("case 1");
			break;
			}
		}
		
		case 2: {
			if (i > 10) {
			System.out.println("case 2");
			break;
			}
		}
		//equal else structural if else
		default:
			if (i >=10) {
			System.out.println("default");
			}
		}
	}

}
