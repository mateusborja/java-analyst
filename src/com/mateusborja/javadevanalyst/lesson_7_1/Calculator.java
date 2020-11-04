package com.mateusborja.javadevanalyst.lesson_7_1;

public interface Calculator {

	double calculate();

	default double calculatePow(double x, double y) {
		return Math.pow(x, y);
	}

}
