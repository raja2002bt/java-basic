package basic;

import java.util.Scanner;

public class Reverse2 {

	public static void main(String[] args) {
		System.out.print("Enter a number :");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int reverse=0,rem;
		while(n>0)
		{
			rem=n%10;
			System.out.print(rem);
			n=n/10;
		}

	}

}
