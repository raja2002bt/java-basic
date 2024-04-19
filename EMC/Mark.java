package EMC;

import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your mark :");
		int mark = in.nextInt();
		if (mark >= 35) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
