package basic;
import java.util.Scanner;
public class SumAvgofn {

	public static void main(String[] args) {
		System.out.print("Enter the Limit :");
		Scanner in=new Scanner(System.in); 
		int n=in.nextInt();
        int sum=0,a; 
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter a number "+i+" :");
			a=in.nextInt();
			sum=sum+a;
		}
		System.out.println("The sum of number is :"+sum);
		System.out.println("The Average of number is :"+sum/n);
	}

}
