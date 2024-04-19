package EMC;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter your Salary : ");
	int Salary =in.nextInt();
	System.out.print("Enter your age : ");
	int age = in.nextInt();
	if (Salary >=20000 && age<=25) {
		System.out.print("Enter loan amount : ");
		int amount=in.nextInt();
		
		if(amount<=50000) {
			System.out.println("You are Eligible.");
		}
		else if(amount>50000) {
			System.out.println("Your eligible Maximum Loan amount is 50000");
	}
	}
	else {
		System.out.println("Not eligible");
	}

	}

}
