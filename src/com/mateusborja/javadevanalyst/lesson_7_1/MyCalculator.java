package com.mateusborja.javadevanalyst.lesson_7_1;

public class MyCalculator implements Calculator {

	private double pow;

	public double calculate() {
		return pow * pow;
	}

	public static void main(String[] args) {

		MyCalculator my = new MyCalculator();
		double pow = my.calculatePow(2.0, 4.0);
		System.out.println(pow);

		Calculator.calculateSqrt(100);
		System.out.println(Calculator.calculateSqrt(100));

	}

}
