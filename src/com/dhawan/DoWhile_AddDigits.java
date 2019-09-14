package com.dhawan;
import java.util.Scanner;

public class DoWhile_AddDigits {

	public static void main(String[] args) {
		// Write a program to add the digits of a number.
		
		System.out.println("Enter a number");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		int digitTotal = 0;
		int i = 0;
		
		do {
			digitTotal = digitTotal + (number % 10);
			number = number / 10;
			i = number;
			
		} while (((i % 10 > 0) || (i / 10) > 0));
		
		System.out.println(digitTotal);
	}

}
