package com.javaBasicProgramPractice;
//Program to find compound interest in java

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String args[]) {
		// declare and initialize here.
		double A = 0, Principle, Rate, Time, t = 1, CI;

		Scanner sc = new Scanner(System.in);

		// enter principal, rate, time here
		System.out.println("Enter Principal: ");
		Principle = sc.nextFloat();

		System.out.println("Enter Rate : ");
		Rate = sc.nextFloat();

		System.out.println("Enter Time : ");
		Time = sc.nextFloat();

		Rate = (1 + Rate / 100);
		for (int i = 0; i < Time; i++) {
			t *= Rate;
		}
		A = Principle * t;
		System.out.println("Amount : " + A);
		CI = A - Principle;
		System.out.println("Compound Interest : " + CI);
	}
}
