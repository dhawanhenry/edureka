package com.dhawan.JavaEssentials.DataHandling;

import java.util.Scanner;

public class ClassThree {
	
	public void salary() {
		int i = 0;
		String sal[] = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		for(i = 0; i < 5; i++) {
			sal[i] = scanner.nextLine();								
		}
		scanner.close();
		
		for(i = 0; i < 5; i++) {
			System.out.print(sal[i]+ "  ");
	    }
	    System.out.println();
	}

}
