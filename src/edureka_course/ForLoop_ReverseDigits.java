package edureka_course;

import java.util.Scanner;

public class ForLoop_ReverseDigits {

	public static void main(String[] args) {
		// Write a program to reverse the digits of a number.
		
		System.out.println("Enter a number");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		int revNumber = 0;

		for(int i = number; i % 10 > 0; i = i / 10) {
			revNumber = (revNumber * 10) + (number % 10);
			number = number / 10;
		}
		System.out.println(revNumber);
		
		
	}

}
