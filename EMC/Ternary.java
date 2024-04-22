package EMC;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		System.out.println("Is it raining ?");
		Scanner in=new Scanner(System.in);
		boolean rain=in.nextBoolean();
		System.out.println(rain?"Take umbrella":"Enjoy the sunshine");

	}

}
