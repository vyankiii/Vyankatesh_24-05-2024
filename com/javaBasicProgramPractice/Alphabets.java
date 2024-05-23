package com.javaBasicProgramPractice;

//Java program to print uppercase and lowercase alphabets
public class Alphabets {
	public static void main(String args[]) {
		char ch;

		/*
		 * // printing uppercase alphabets...
		 * System.out.println("Uppercase Alphabets:"); for (ch = 'A'; ch <= 'Z'; ch++) {
		 * System.out.print(ch + " "); }
		 * 
		 * // printing new line System.out.println("");
		 * 
		 * // printing lowercase alphabets System.out.println("Lowercase Alphabets:");
		 * for (ch = 'a'; ch <= 'z'; ch++) { System.out.print(ch + " ");
		 */

		//ASCII value of uppercase alphabets – 65 to 90.
		//ASCII value of lowercase alphabets – 97 to 122.
		for (char ch1 = 65; ch1 <= 90; ch1++) {
			System.out.print(" " + ch1);
		}

		System.out.println("");

		for (char ch2 = 97; ch2 <= 122; ++ch2) {
			System.out.print(" " + ch2);
		}

	}
}
