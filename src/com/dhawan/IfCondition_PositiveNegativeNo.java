package com.dhawan;
import java.util.Scanner;

public class IfCondition_PositiveNegativeNo {
	
	public static void main(String[] args) {
		
		// Write a program to check if the number is positive or negative.
		
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		
		int number;
		
		number = scanner.nextInt();
		scanner.close();
		
		if(number >= 0) {
			System.out.println(number + " is a positive number");
		} else {
			System.out.println(number + " is a negative number");
		}
	}
}


