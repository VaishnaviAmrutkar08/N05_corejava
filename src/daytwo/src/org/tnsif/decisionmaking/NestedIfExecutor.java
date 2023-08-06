package org.tnsif.decisionmaking;
import java.util.Scanner;
public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		int weight=scan.nextInt();
		
		if(age>=12) {
			
			if(weight>=40) {
				System.out.println("Eligible for bunjee jumping");
				
				if(weight>=110) {
					System.out.println("Extra ropes will be added");
				}
				
				
			}
			else {
				System.out.println(" Not Eligible for bunjee jumping");
			}
			
			
		   }
		else {
			System.out.println("Not Eligible for bunjee jumping");
		}
		scan.close();
	 

	}

}
