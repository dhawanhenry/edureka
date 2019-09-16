package com.dhawan.JavaEssentials.DataHandling;

import java.util.Scanner;

public class ClassTwo {
	
	public void name() {
		int i = 0;
		String name[] = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		
		for(i = 0; i < 5; i++) {
			name[i] = scanner.nextLine();								
		}
		scanner.close();
		
		for(i = 0; i < 5; i++) {
			System.out.print(name[i]+ "  ");
	    }
	    System.out.println();
	}

}
