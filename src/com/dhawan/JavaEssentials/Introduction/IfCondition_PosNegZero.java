package com.dhawan.JavaEssentials.Introduction;

import java.util.Scanner;

public class IfCondition_PosNegZero {

	public static void main(String[] args) {
		
		// Extend the previous program to check whether the given number is positive, zero or negative.
							
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
			
		int number;
			
		number = scanner.nextInt();
		scanner.close();
			
		if(number > 0) {
			System.out.println(number + " is a positive number");
		} else if (number == 0) {
			System.out.println(number + " is a zero");
		} else {
			System.out.println(number + " is a negative number");
		}
	}
}
