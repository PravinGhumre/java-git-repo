package com.designpatterns.behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		Context context = new Context(new AddStategy());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		context = new Context(new SubstractStategy());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		context = new Context(new MultiplyStategy());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
