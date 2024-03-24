package basic;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSpecificElement {

	public static void main(String[] args) {
		int a[]=new int[] {72,46,23,56,12,54,86,32,67,98,33};
		System.out.println("Before Changing :"+Arrays.toString(a));
		Scanner in=new Scanner(System.in);
		System.out.print("Enter an Index :");
		int index=in.nextInt();
		System.out.print("Enter a Value :");
		int value=in.nextInt();
		
		for(int i=a.length-1;i>index;i--) {
		a[i]=a[i-1];	
		}
		a[index]=value;
		System.out.println("Before Changing :"+Arrays.toString(a));
	}

}
