package basic;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int reverse=0,rem;
		while(n!=0)
		{
			rem=n%10;
			
			n=n/10;
			reverse=(reverse*10)+rem;
		}
		System.out.println(reverse);
	}

}
