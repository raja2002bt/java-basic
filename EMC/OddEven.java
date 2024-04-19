package EMC;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = in.nextInt();
		if(num % 2==0) {
			System.out.println("It's an Odd number");
		}
		else {
			System.out.println("It's an Even number");
		}

	}

}
