package basic;
import java.util.*;
public class While {

	public static void main(String[] args) {
		System.out.print("Enter a Limit :");
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}

	}
}
