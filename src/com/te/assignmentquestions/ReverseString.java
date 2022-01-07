package com.te.assignmentquestions;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string ");
		String input = scanner.next();
		String reverse = "";
		//if (!(input == null || input.length() >= 1)) {
			for (int i = input.length() - 1; i >= 0; i--) {
				reverse = reverse + input.charAt(i);
			}
			System.out.println("reverse string:" + reverse);

		}

	//}
}
