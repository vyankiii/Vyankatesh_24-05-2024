package com.javaBasicProgramPractice;

import java.util.*;

/*Java Program to check whether entered number is EVEN or ODD 
we will divide number by 2 and check remainder is ZERO or not,
if remainder is ZERO, number will be EVEN others number will be ODD.*/
public class OddEven {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Enter number: ");
		num = sc.nextInt();

		// check EVEN or ODD
		if (num % 2 == 0) {
			System.out.println(num + " is EVEN number...");
		} else {
			System.out.println(num + " is ODD number...");
		}
	}
}
