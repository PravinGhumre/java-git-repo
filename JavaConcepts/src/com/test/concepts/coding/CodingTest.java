package com.test.concepts.coding;

public class CodingTest {

	public static void main(String[] args) {
		System.out.println(CodingTest.encode(1, "abcdz"));
		System.out.println(CodingTest.encode(-1, "abcdz"));
	}

	private static String encode(int offset, String values) {
		StringBuilder sb = new StringBuilder();
		for (Character value : values.toCharArray()) {
			if (offset == 1) {
				sb.append(value == 'z' ? 'a' : ++value);
			} else if (offset == -1) {
				sb.append(value == 'a' ? 'z' : --value);
			}
		}
		return sb.toString();
	}
}
