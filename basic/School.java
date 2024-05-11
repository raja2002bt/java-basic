package basic;

import java.util.Scanner;

public class School {
	public String passorfail(int mark) {
		if(mark>=35) {
			return "pass" ;
		}
		else {
			return "fail";
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the result :");
		int mark =in.nextInt();
		School o= new School();
		String result=o.passorfail(mark);
		System.out.println(result);

	}

}
