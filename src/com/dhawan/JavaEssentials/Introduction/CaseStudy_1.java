package com.dhawan.JavaEssentials.Introduction;

import java.util.Scanner;

public class CaseStudy_1 {

	public static void main(String[] args) {
		/*
		An Amusement park company wants one application for their billing counter 
		to enable ticket sale. Assume the Amusement park authorities approached Max 
		to get this application developed.
		
		This application should have ticket prize asRs400 per person and if a person 
		buys more than 10 tickets then person is eligible for 10 percent discount. 
		Calculate the total bill or amount according to the number of tickets 
		that are sold.
		*/
		
		
		System.out.println("Enter number of tickets: ");
		
		Scanner scanner = new Scanner(System.in);
		int numberOfTickets = scanner.nextInt();
		scanner.close();
		int costOfTicket = 400;
		
		double totalCost = costOfTicket * numberOfTickets;
		double reducedtotalCost = (0.9) * (costOfTicket * numberOfTickets);
		
		if((numberOfTickets > 0) && (numberOfTickets < 11)) {
			System.out.println("Cost of " + numberOfTickets + " is = " + totalCost);
		} else if (numberOfTickets > 10) {
			System.out.println("Cost of " + numberOfTickets + " is = " + reducedtotalCost);
		} else {
			System.out.println("You entered invalid number of tickets");

		}
	}

}
