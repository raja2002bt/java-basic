package EMC;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter your Score :");
		int Score=in.nextInt();
		if (Score < 50 ) {
			System.out.println("You need to improve");
		}
		else if (Score >= 50 && Score <= 70) {
			System.out.println("Good job");
		}
		else if(Score > 70) {
			System.out.println("Excellent performance !");
		}

	}

}
