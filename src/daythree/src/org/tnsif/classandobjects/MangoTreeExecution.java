package org.tnsif.classandobjects;

import java.util.Scanner;

public class MangoTreeExecution {
	
	static void isMangoTree(int n, int t)
	{
		if(t%n==0 || t%n==1 || t<=n) {
			System.out.println("Mango Tree");
		}
		
		else {
			System.out.println(" Not a Mango Tree");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the values of n and t: ");
		
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
		
	}

}
