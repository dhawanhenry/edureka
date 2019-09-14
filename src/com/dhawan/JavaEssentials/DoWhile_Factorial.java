package com.dhawan.JavaEssentials;
import java.util.Scanner;

public class DoWhile_Factorial {

	public static void main(String[] args) {
		// Write a program to find factorial of a number.
		
		System.out.println("Enter a number");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		int factorial = 0;
		int i = number;
		
		do {
			number = number * (i - 1);
			i = i - 1;
			factorial = number;
			
		} while ((i - 1) > 0);
		
		//factorial = number;
		System.out.println("Factorial = " + factorial);



	}

}
