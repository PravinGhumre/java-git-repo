package com.test.concepts.coding;

public class AddtionWithoutOperator {

	public static void main(String[] args) {
		int a = 759;
		int b = 674;

		int sum = addTwoNumbers(a, b);

		System.out.println(sum);

	}

	private static int addTwoNumbers(int a, int b) {
		System.out.println(a + " " + b + " \n");
		if (b == 0) {
			System.out.println(" B is Zero now !!");
			return a;
		}
		int sum = a ^ b;
		int carry = (a & b) << 1;

		return addTwoNumbers(sum, carry);
	}
}
