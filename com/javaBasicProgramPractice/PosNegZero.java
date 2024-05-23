package com.javaBasicProgramPractice;

//Java program to check number is positive, negative or zero.

import java.util.*;

class PosNegZero {
	public static void main(String[] s) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");
		num = sc.nextInt();
		// check condition for +ve, -ve and Zero
		if (num > 0)
			System.out.println(num + " is Positive Number.");
		else if (num < 0)
			System.out.println(num + " is Negative Number.");
		else
			System.out.println("It's Zero.");

	}
}
