package basic;
import java.util.*;
public class For {

	public static void main(String[] args) {
		System.out.println("Enter a limit :");
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		for(int i=1;i<=n;i+=2)
		{
			System.out.println(i);
		}
	}
}
