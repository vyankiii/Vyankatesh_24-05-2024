package com.javaBasicProgramPractice;

import java.util.*; // import java.util.* for Scanner class

//Find sum and average of two numbers in Java
public class Number {
	public static void main(String args[]) {
		int x, y, sum;
		float avg;

		Scanner sc = new Scanner(System.in);
//		Taking integer inputs
		System.out.print("First number:");
		x = sc.nextInt();

		System.out.print("Second number:");
		y = sc.nextInt();

		sum = x + y;// Performing mathematical operations
		avg = (float) ((x + y) / 2);// casting the sum to float before dividing by 2
//		Printing the values on output screen
		System.out.print("Sum: " + sum + "Average: " + avg);
	}
}
