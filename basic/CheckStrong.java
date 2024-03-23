package basic;

import java.util.Scanner;

public class CheckStrong {

	public static void main(String[] args) {
		int num,originalnum,rem;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number :");
		num=in.nextInt();
		originalnum=num;
		while(num>0) {
			rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
	}

}
