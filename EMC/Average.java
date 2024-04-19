package EMC;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter English mark :");
		int English=in.nextInt();
		System.out.print("Enter Tamil mark : ");
		int Tamil=in.nextInt();
		System.out.print("Enter Maths mark : ");
		int Maths=in.nextInt();
		System.out.print("Enter Science mark : ");
		int Science=in.nextInt();
		System.out.print("Enter Social Science mark : ");
		int Social=in.nextInt();
		int total = English + Tamil + Maths + Science + Social ;
		int avg=total/5;
		System.out.println("Total : "+total);
		System.out.println("Average : "+avg);
		if(avg<35) {
			System.out.println("Additional class is required.");
		}
		else {
			System.out.println("You are good to go.");
		}

	}

}
