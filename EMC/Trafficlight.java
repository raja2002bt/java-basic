package EMC;

import java.util.Scanner;

public class Trafficlight {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the Traffic Signal ?");
		String Light =in.next();
		if (Light.equals("Red")||Light.equals("red")) {
			System.out.println("Stop#");
		}
		else if(Light.equals("Yellow")||Light.equals("yellow")) {
			System.out.println("Get ready!");
		}
		else if(Light.equals("Green")||Light.equals("green")) {
			System.out.println("Goo...");
		}
		else {
			System.out.println("Invalid input");
		}

	}

}
