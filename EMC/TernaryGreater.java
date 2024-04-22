package EMC;

import java.util.Scanner;

public class TernaryGreater {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value A : ");
		int A=in.nextInt();
		System.out.println("Enter a value B : ");
		int B=in.nextInt();
		System.out.println(A>B?A+" is greater":B+" is greater");
	}

}
