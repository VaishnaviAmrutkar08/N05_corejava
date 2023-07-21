package org.tnsif.intro;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		//number
		System.out.println("Enter the number;");
		int num = s.nextInt();
		System.out.println("here is the given value: "+num);
		
		//float number
		System.out.println("Enter the value of floatnum");
		float num1=s.nextFloat();
		System.out.println("The value of floatnum is: "+num1);
		
		//character
		System.out.println("Enter the Character");
		char c=s.next().charAt(1);
		System.out.println("Character is: "+c);
		
		//string
		System.out.println("Enter the String");
		String str1=s.next();
		System.out.println("String is:" +str1);
	}

}
