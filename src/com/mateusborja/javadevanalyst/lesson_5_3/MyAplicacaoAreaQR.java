//java modifiers static
package com.mateusborja.javadevanalyst.lesson_5_3;

import java.text.DecimalFormat;
import java.util.*;

public class MyAplicacaoAreaQR {

	public static void main(String[] args) {

		DecimalFormat dc = new DecimalFormat();
		Scanner scn = new Scanner(System.in);
		

		double side, area;

		System.out.println("tell me side your square in meters: \n");
		side = scn.nextDouble();

		area = QR.calcularArea(side);
		System.out.println("your area is: " + dc.format(area) + " in sqm");


	}

}
