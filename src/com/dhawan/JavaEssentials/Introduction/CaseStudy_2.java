package com.dhawan.JavaEssentials.Introduction;

import java.util.Scanner;

public class CaseStudy_2 {

	public static void main(String[] args) {
		/*
		 John and Paul went to watch a movie in theatre where they need to buy two tickets. 
		 There are two types of tickets,one Golden category and other as silver category.
		 If they buy tickets for silver category,then per person a ticket should cost Rs.150 
		 and for golden category ticket should cost them Rs.200 each. Considering this scenario, 
		 write a program for theatre ticket booking application scenario.
		 */
		
		System.out.println("Please choose ticket category");
		
		Scanner scanner = new Scanner(System.in);
		String ticket = scanner.nextLine();
		scanner.close();
		String ticketCategory = ticket.toLowerCase();
		
		if(ticketCategory.equals("golden")) {
			System.out.println("Tickets cost Rs. " + 200 * 2 + " as you chose ticket Category " + ticketCategory);
		} else if (ticketCategory.equals("silver")) {
			System.out.println("Tickets cost Rs. " + 150 * 2 + " as you chose ticket Category " + ticketCategory);

		}
	}
}
