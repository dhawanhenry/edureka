package com.dhawan;
import java.util.Scanner;

public class IfCondition_LargestNum {

	public static void main(String[] args) {
		
	// Write a program to find largest of two numbers
		
		System.out.println("Enter first number");
		Scanner scanner = new Scanner(System.in);
			
		int numberOne;
		int numberTwo;
			
		numberOne = scanner.nextInt();
		System.out.println("Enter second number");
		numberTwo = scanner.nextInt();
		scanner.close();
		
		if(numberOne > numberTwo) {
			System.out.println("First number " + numberOne + " is greater than Second number " + numberTwo);
		} else if (numberTwo > numberOne) {
			System.out.println("Second number " + numberTwo + " is greater than First number " + numberOne);
		} else {
			System.out.println("First number " + numberOne + " is equal to Second number " + numberTwo);
		}

	}

}
