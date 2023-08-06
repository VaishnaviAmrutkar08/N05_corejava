package org.tnsif.loopinghomework;
import java.util.Scanner;
public class AnglePattern {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt(); // Size of the triangle, the number of rows

	        // Loop through each row
	        for (int i = 1; i <= n; i++) {

	            // Print asterisks for each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            // Move to the next line after printing the row
	            System.out.println();
	        }
	}

}
