package com.javaBasicProgramPractice;

// Java Program to find square, square root and cube of a given number
import java.util.*;

public class SquareCubeSquareroot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter number:");
		num = sc.nextInt();
		System.out.println("square of " + num + " is: " + Math.pow(num, 2));
		System.out.println("cube of " + num + " is: " + Math.pow(num, 3));
		System.out.println("square root of " + num + " is: " + Math.sqrt(num));

//		Math.pow(m,n):
//			It is used to get the power of any base, it will return m to the power of n (m^n).
//			Math.sqrt(m):
//			It is used to get the square root of any number, it will return square root of m.

	}
}
