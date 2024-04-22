package EMC;

import java.util.Scanner;

public class NumfromAtoB {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number A : ");
		int A=in.nextInt();
		System.out.println("Enter a number B :");
		int B=in.nextInt();
		for(int i=A;i<=B;i++) {
			System.out.println(i);
		}

	}

}
