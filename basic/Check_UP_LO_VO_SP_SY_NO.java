package basic;

import java.util.Scanner;

public class Check_UP_LO_VO_SP_SY_NO {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String :");
		String n = in.nextLine();
		StringBuilder a = new StringBuilder(n);
		int upper = 0, lower = 0, numbers = 0, space = 0,vowels = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
				upper++;
			}
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
				lower++;
			}
			if (a.charAt(i) == 32) {
				space++;
			}
			if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
				numbers++;
			}
			if (a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I'|| a.charAt(i)=='0' || a.charAt(i)=='U' || a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
				vowels++;
		}
		
	}
		System.out.println("UpperCase :" + upper);
		System.out.println("LowerCase :" + lower);
		System.out.println("Numeric :" + numbers);
		System.out.println("Space :" + space);
		System.out.println("Vowels :"+vowels);
		System.out.println("Symbols :"+(a.length()-(upper+ lower+ numbers+ space)));
}
}
