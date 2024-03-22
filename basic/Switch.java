package basic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a,b,c,ch;
		System.out.println("1.Addition");
		System.out.println("2.Subraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter your choice :");
		Scanner in=new Scanner(System.in);
		ch=in.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print("Enter a number :");
			a=in.nextInt();
			System.out.print("Enter a number :");
			b=in.nextInt();
			c=a+b;
			System.out.println("Addition : "+c);
			break;
		case 2:
			System.out.print("Enter a number :");
			a=in.nextInt();
			System.out.print("Enter a number :");
			b=in.nextInt();
			c=a-b;
			System.out.println("Subraction : "+c);
			break;
		case 3:
			System.out.print("Enter a number :");
			a=in.nextInt();
			System.out.print("Enter a number :");
			b=in.nextInt();
			c=a*b;
			System.out.println("Multiplication :"+c);
			break;
		case 4:
			System.out.print("Enter a number :");
			a=in.nextInt();
			System.out.print("Enter a number :");
			b=in.nextInt();
			c=a/b;
			System.out.println("Division :"+c);
			break;
		default:
			System.out.println("Invalid Input");
		
		}
	}

}
