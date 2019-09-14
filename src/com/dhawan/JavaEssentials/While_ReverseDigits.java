package com.dhawan.JavaEssentials;
import java.util.Scanner;

public class While_ReverseDigits {

	public static void main(String[] args) {
		// Write a program to reverse the digits of a number.
		
		System.out.println("Enter a number");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		int revNumber = 0;
		int i = number;
		
		while(((i % 10 > 0) || (i / 10) > 0)) {
			revNumber = (revNumber * 10) + (number % 10);
			number = number / 10;
			i = number;
		}
		
		System.out.println(revNumber);


	}

}
