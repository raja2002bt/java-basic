package basic;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		System.out.print("Enter a number :");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int i,f=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				f++;
			}
		}
		if(f==2) {
			System.out.print(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}

}
