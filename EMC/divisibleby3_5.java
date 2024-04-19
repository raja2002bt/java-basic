package EMC;

import java.util.Scanner;

public class divisibleby3_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 System.out.print("Enter a number :");
		 int number=in.nextInt();
	
		 if (number % 3==0 && number % 5 == 0 ) {
			 System.out.println("divisible");
		 }
		 else {
			 System.out.println("Not divisible");
		 }
	}

}
