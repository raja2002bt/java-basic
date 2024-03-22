package basic;
import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
	 System.out.print("Enter a limit :");
	 Scanner num=new Scanner(System.in);
	 int n=num.nextInt();
	 int i=2;
	 do {
		 System.out.println(i);
		 i=i+2;
	 }while(i<=n);
	 
	}

}
