//create methods and class
package com.mateusborja.practice;

public class Practice16 {
	
	public void appSum() {
		int i,j;
		
		for (i=100; i<1000; i++) {
			for (j=100; j<1000; j++) {
				int n = i +j;
				if (n == 888) {
					System.out.println("A Soma de " + i + " + o número " + j + " é igual a = " + n);
				}
			}
		}
		
	}

}
