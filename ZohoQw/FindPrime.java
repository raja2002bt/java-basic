package ZohoQw;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		int f = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a limit : ");
		int n = in.nextInt();
		int b[] = new int[n];
		for (int i = 0; i < b.length; i++) {
			System.out.print("Enter a number : ");
			b[i] = in.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			
			if (b[i] % 2 != 0 && b[i] % 3 != 0 && b[i] % 5 != 0 && b[i] % 7 != 0) {
			System.out.println(b[i]);
			} else if (b[i] == 2 || b[i] == 3 || b[i] == 5 || b[i] == 7) {
			System.out.println(b[i]);
			}

		}

	}

}
