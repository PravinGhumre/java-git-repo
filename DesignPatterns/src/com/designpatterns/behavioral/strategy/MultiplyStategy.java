package com.designpatterns.behavioral.strategy;

public class MultiplyStategy implements Strategy {
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}
