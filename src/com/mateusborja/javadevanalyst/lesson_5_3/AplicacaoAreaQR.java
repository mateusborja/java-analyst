//java constructor
package com.mateusborja.javadevanalyst.lesson_5_3;

public class AplicacaoAreaQR {

	public static void main(String[] args) {

		// instance Retangulo Class with objects
		RT r1 = new RT();
		RT r2 = new RT(15, 135);
		RT r3 = new RT();

		double arear1 = r1.calcularArea();
		double arear2 = r2.calcularArea();
		double arear3 = r3.calcularArea();

		r3.setValores(15, 25);

		System.out.println(arear1 + " square meters");
		System.out.println(arear2 + " sqm");
		System.out.println(arear3 + " square meters" +"\n");

		// instance Quadrado class with objects
		//Quadrado q1 = new Quadrado();
		//Quadrado q2 = new Quadrado();

		//double areaq1 = q1.calculcarArea();
		
		double areaq1 = QR.calcularArea(5);
		

		//q2.setLado(25);

		//double areaq2 = q2.calcularArea();
		
		//call attributes static
		double areaq2 = QR.calcularArea(2);

		System.out.println(areaq1 + " meters");
		System.out.println(areaq2 + " meters");

	}

}
