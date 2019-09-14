package com.dhawan;
import java.util.Scanner;

public class ForLoop_Factorial {

	public static void main(String[] args) {
		// Write a program to find factorial of a number.
		
		System.out.println("Enter a number");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		int factorial = 0;
		
		for(int i = number; i > 0; i--) {
			if((i - 1) > 0) {
				number = number * (i - 1);
				factorial = number;
			}
			factorial = number;
		}
		System.out.println("Factorial = " + factorial);
	}
}
