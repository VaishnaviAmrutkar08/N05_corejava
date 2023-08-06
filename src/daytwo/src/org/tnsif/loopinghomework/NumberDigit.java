package org.tnsif.loopinghomework;
import java.util.Scanner;
public class NumberDigit {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		
		int count=0;
		do {
			n=(n/10);
			count++;
			
		}
		
		while (n!=0 );
		System.out.println("Number of digits in a given number :  "+count);
	}

}
