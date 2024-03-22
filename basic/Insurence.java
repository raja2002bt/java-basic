package basic;
import java.util.Scanner;
public class Insurence {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter marital status :");
		char marital,gender;
		int age;
		marital=in.next().charAt(0);
		if(marital=='u'|| marital=='U') 
		{
			System.out.print("Gender :");
			gender=in.next().charAt(0);
			System.out.print("Enter your age :");
			age=in.nextInt();
			
			if((gender=='m'||gender=='M')&&(age>=30))
			{
				System.out.print("You are Eligible");
			}
			else if((gender=='f'||gender=='F')&&(age>=25))
			{
				System.out.print("You are Eligible");
			}
			else 
			{
				System.out.print("Not Eligible");
			}
			
		}
		else if(marital=='m'||marital=='M')
		{
			System.out.print("You are Eligible");
		}
		else {
			System.out.print("Invalid input");
		}

	}

}
