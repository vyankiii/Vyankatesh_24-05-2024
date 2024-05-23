package com.javaBasicProgramPractice;

//Java program to check whether year is Leap year or not.

import java.util.*;

class LeapYear {
	public static void main(String[] s) {
		int year;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter year:");
		year = sc.nextInt();

		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
			System.out.println(year + " is a Leap Year.");
		else
			System.out.println(year + " is not a Leap Year.");
	}

}
