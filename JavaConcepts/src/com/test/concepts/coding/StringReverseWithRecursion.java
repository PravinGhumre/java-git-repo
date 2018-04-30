package com.test.concepts.coding;

public class StringReverseWithRecursion {

	public static void main(String[] args) {

		String name = "PRAVIN";

		System.out.println("Reverse of \'"+name+"\' is \'"+reverse(name)+"\'"); 

	}

	static String reverse(String str) {
		System.out.println(" reverse String  " + str);
		if ((str == null) || (str.length() <= 1)) {
			System.out.println(" Final String  " + str);
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
