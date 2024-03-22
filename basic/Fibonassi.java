package basic;

import java.util.Scanner;

public class Fibonassi {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=-1,b=1,c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
	}

}
