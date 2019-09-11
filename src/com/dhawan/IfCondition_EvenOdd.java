package com.dhawan;

import java.util.Scanner;

public class IfCondition_EvenOdd {

	public static void main(String[] args) {
		// Write a program to check given number is even or odd.
		
		System.out.println("Enter the number");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		if(number >= 0) {
			if(number % 2 == 0) {
				System.out.println("Number " + number + " is EVEN");
			} else {
				System.out.println("Number " + number + " is ODD");
			}
		} else {
			System.out.println("Number " + number + " is negative ");
		}
	}

}
