package com.dhawan.JavaEssentials.Introduction;

public class While_TenEvenOdd {

	public static void main(String[] args) {
		// Write a program to print 10 even numbers and 10 odd numbers.

		int i = 1;	
		System.out.println("List of 10 Even numbers");

		do {
			System.out.println(i * 2);
			i = i + 1;			
		} while(i < 11);
		
		i = 0;
		System.out.println("List of 10 Odd numbers");
		
		while(i < 10) {
			System.out.println((2 * i) + 1);
			i = i + 1;
		}
	}

}
