package EMC;

import java.util.Scanner;

public class Arrayof5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] number=new int[5];
		number[0]=in.nextInt();
		number[1]=in.nextInt();
		number[2]=in.nextInt();
		number[3]=in.nextInt();
		number[4]=in.nextInt();
		System.out.println(number[0]+number[1]+number[2]+number[3]+number[4]);

	}

}
