package basic;

import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		int e=0,o=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a limit :");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter a value of a["+i+"] :");
			a[i]=in.nextInt();
		}
//		for(int element : a){                  //Enhanced For Loop
//			if(element%2==0) {
//				e++;
//			}
//			else {
//				o++;
//			}
//		}
		for(int j=0;j<a.length;j++)            //For Loop
		{
			if(a[j]%2==0) {
				e++;                           //Count of Even
				//e+=a[j];                     //Sum of Even
			}
			else {
				o++;                           //Count of Odd
				//o+=a[j];                     //Sum of Odd
			}
		}
		System.out.println("The count of EVEN no :"+e);
		System.out.println("The count of ODD no :"+o);
	}

}
