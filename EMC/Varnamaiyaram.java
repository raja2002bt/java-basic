package EMC;

import java.util.Scanner;

public class Varnamaiyaram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("IS Megna alive : ");
		String A=in.next();
		if (A.equals("Yes")||A.equals("yes")) {
			System.out.println("Suriya weds Megna");
		}
		if (A.equals("No") || A.equals("no")) {
			System.out.println("Suriya meets Ramya");
		}
	}

}
