package com.javaBasicProgramPractice;

import java.util.*;

public class SwapNumbWithAndWithoutThirdVarible {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value of a: ");
		a = sc.nextInt();
		System.out.print("Enter value of b: ");
		b = sc.nextInt();

		/*
		 * // Swapping of numbers using third variable
		 * System.out.println("Before swapping Values a: " + a + " b: " + b); // using
		 * thrid variable int temp; temp = a; a = b; b = temp;
		 * System.out.println("After swapping Values a: " + a + " b: " + b);
		 */
		
		//2) Swapping of numbers without using third variable
		System.out.println("Before swapping values a: "+ a +" b: " + b);
		//a = 10 and b = 20
		a=a+b; // a = 10 + 20 = 30
		b=a-b; // b = 30 - 20 = 10
		a=a-b; // a = 30 - 10 = 20 then values a = 20 ,b = 10
		System.out.println("After swapping values a: "+ a +" b: " + b);
	}
}
