package com.te.assignmentquestions;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String input;
		String AfterPalindrome="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string");
		input=scanner.nextLine();
				for(int i=input.length()-1;i>=0;i--) {
					AfterPalindrome+=input.charAt(i);
					
				}
				//System.out.println("afterpalindrome:" +AfterPalindrome);
				if(AfterPalindrome.equals(input)) {
					System.out.println("palindrome");
				}
				else {
					System.out.println("not palindrome");
				}
		
		
	}

}
