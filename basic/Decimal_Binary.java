package basic;

import java.util.Scanner;

public class Decimal_Binary {
	public static void dec_bin(int n) {
		int binary[]=new int[1000];
		int i=0;
		while(n>0) {
			binary[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
			System.out.print(binary[j]);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=in.nextInt();
		System.out.print("Binary number is :");
		dec_bin(n);
		

	}

}
