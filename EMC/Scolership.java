package EMC;

import java.util.Scanner;

public class Scolership {
 public static void main(String args[]) {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter your Monthly income :");
	 int monthly_income=in.nextInt();
	 if (monthly_income <= 7000) {
		 System.out.println("Schlorship available");
	 }
	 else {
		 System.out.println("Not available");
	 }
 }
 
}
