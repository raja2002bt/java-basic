package basic;

import java.util.Scanner;

public class CheckStrong {

	public static void main(String[] args) {
		int num,originalnum,rem,fact,i,Sum=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number :");
		num=in.nextInt();
		originalnum=num;
		while(num>0) {
			rem=num%10;
			//System.out.println("Remainder :"+rem);
			fact=1;
			for(i=1;i<=rem;i++) {
				fact*=i;
			}
			//System.out.println("Factorial :"+fact);
			Sum+=fact;
			num=num/10;
		}
		if (Sum==originalnum) {
			System.out.println(originalnum+" is a Strong number");
		}
		else {
			System.out.println(originalnum+" is not a Strong number");
		}
	}

}
