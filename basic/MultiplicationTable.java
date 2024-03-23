package basic;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=in.nextInt();
		System.out.print("Ente a Limit :");
		int l=in.nextInt();
		for(int i=0;i<=l;i++)
		{
			System.out.println(n+" x "+i+" = "+n*i);
		}
		
	}

}
