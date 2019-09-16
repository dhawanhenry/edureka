package com.dhawan.JavaEssentials.DataHandling;

import java.util.Scanner;

public class ClassOne {
	
	public void id() {
		int i = 0;
		String id[] = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		for(i = 0; i < 5; i++) {
			id[i] = scanner.nextLine();								
		}
		scanner.close();
		
		for(i = 0; i < 5; i++) {
			System.out.println(id[i]+ "  ");
	    }
	    System.out.println();
	}

}
