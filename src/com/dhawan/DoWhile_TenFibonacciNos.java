package com.dhawan;
public class DoWhile_TenFibonacciNos {
	
	public static void main(String[] args) {
		// Write a program to generate 10 Fibonacci numbers.
		
		System.out.println("Fibonacci number 1 = 0");
		int one = 0;
		int two = 1;
		int fibo = 1;
		int i = 2;
		
		do {
			System.out.println("Fibonacci number " + i + " = " + fibo);
			fibo = one + two;
			one = two;
			two = fibo;
			i = i + 1;
		} while(i < 11);
	}
}
