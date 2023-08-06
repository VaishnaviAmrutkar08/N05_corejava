package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age:\n");
		int age = scan.nextInt();
		
		System.out.println("Enter your weight:\n");
		int weight = scan.nextInt();
		
		if(age>=18 && weight>=50) {
			System.out.println("you are eligible to donate the blood");
		}
		
		else {
			System.out.println("you are not eligible to donate the blood");

	}

	}
}
