package basic;

import java.util.Scanner;

public class StringConcept {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = "Raja Pratheep";
		String b = "raja Pratheep";
		System.out.println("A : " + a);
		System.out.println("B : " + b);

		System.out.println("A Hashcode : " + a.hashCode());
//885		System.out.println("B Hashcode : " + b.hashCode());
		System.out.println("Equals : " + a.equals(b));
		System.out.println("Equal Ignore Case : " + a.equalsIgnoreCase(b));
		System.out.println("Length : " + a.length());
		System.out.println("CharAt : " + a.charAt(1));
		System.out.println("Uppercase : " + a.toUpperCase());
		System.out.println("Lowercase : " + a.toLowerCase());
		System.out.println("Replace : " + a.replace("Raja", "Nirmal"));
		System.out.println("Contains : " + a.contains("Raja"));
		System.out.println("IsEmpty : " + a.isEmpty());
		System.out.println("End With : " + a.endsWith("eep"));
		System.out.println("Start With : " + a.startsWith("Raj"));
		System.out.println("Substring : " + a.substring(5));
		System.out.println("Substring : " + a.substring(0, 5));
		char[] Carry = a.toCharArray();
		for (char c : Carry) {
			System.out.print(c + " ");
		}
		System.out.println();
		String c = " Programmer ";
		System.out.println("Length : " + c.length());
		System.out.println("C :" + c);
		System.out.println("C trim :" + c.trim());
		System.out.println("C Trim Length : " + c.trim().length());
	}

}
