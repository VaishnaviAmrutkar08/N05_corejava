package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int songno=scan.nextInt();
		switch(songno) {
		
		case 1:
			System.out.println("Perfect");
			break;
			
		case 2:
			System.out.println("Oo Antava");
			break;
			
		case 3:
			System.out.println("Taki taki");
			break;
			
		default:
			System.out.println("Invalid Input");
		}
		
	}

}
