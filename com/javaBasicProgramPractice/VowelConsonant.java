package com.javaBasicProgramPractice;

import java.util.Scanner;

//Java program to check whether a character is a VOWEL or CONSONANT using switch statement
public class VowelConsonant {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		char ch;
		System.out.printf("Enter a character: ");
		ch = Sc.next().charAt(0);

		// Check if the character is a vowel
		switch (ch) {
		case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a vowel.");
		default -> System.out.println(ch + " is not a vowel.");
		}
	}

}
