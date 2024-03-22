package basic;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
	System.out.print("Enter a number :");
	Scanner in =new Scanner(System.in);
	int n=in.nextInt();
	int f=1;
	for(int i=1;i<=n;i++)
	{
		f=f*i;
	}
	System.out.print("The Factorial of "+n+" is "+f);
	
	}

}
