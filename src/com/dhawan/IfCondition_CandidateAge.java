package com.dhawan;

import java.util.Scanner;

public class IfCondition_CandidateAge {

	public static void main(String[] args) {
		
		// Write a program to check if a candidate iseligible for voting or not. 
		System.out.println("Enter Candidate age:");
		Scanner scanner = new Scanner(System.in);
		
		int candidateAge = scanner.nextInt();
		scanner.close();
		
		if(candidateAge >= 18) {
			System.out.println("Candidate with age " + candidateAge + " is eligible for voting");
		} else {
			System.out.println("Candidate with age " + candidateAge + " is not eligible for voting");
		}
	}

}

