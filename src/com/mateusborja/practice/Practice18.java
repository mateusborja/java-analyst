//methods
package com.mateusborja.practice;

import javax.swing.JOptionPane;

public class Practice18 {
	
	public void myCar () {
		String x = JOptionPane.showInputDialog("Qual ano do seu Carro?");
		int result1 = Integer.parseInt(x);
		
		String y = JOptionPane.showInputDialog("Qual a cor do seu Carro?");
		int result2 = Integer.parseInt(y);
		
		System.out.println("Seu caro é do ano" + result1 + "e a cor é" + result2);
	}
	

}
