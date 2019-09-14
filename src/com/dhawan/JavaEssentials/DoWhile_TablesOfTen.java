package com.dhawan.JavaEssentials;
public class DoWhile_TablesOfTen {

	public static void main(String[] args) {
		// Write a program to generate tables of 10.
		
		int i = 1;
		do {
			System.out.println("10 x " + i + " = " + 10 * i);
			i = i + 1;
		} while(i < 11);
		
	}

}
