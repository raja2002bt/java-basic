package basic;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		System.out.print("Enter a 3 digit number :");
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int temp=number;
		int digit1,digit2,digit3,result;
		
		digit3=temp%10;
		temp=temp/10;
		
		digit2=temp%10;
		temp=temp/10;
		
		digit1=temp%10;
		
		result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
		if(result==number)
		{
			System.out.println("The "+number+" is an Amstrong number.");
		}
		else {
			System.out.println("The "+number+" is not an Amstrong number.");
		}

	}

}
