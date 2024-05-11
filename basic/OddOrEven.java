package basic;

import java.util.Scanner;

class Find{
	public void evenorodd(int num) {
		if(num%2==0) {
			System.out.println(num+ " is an even number");
		}
		else {
			System.out.println(num+ " is an odd number");
		}
	}
}
public class OddOrEven {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number :");
		int num =in.nextInt();
		Find o=new Find ();
		o.evenorodd(num);
	}

}
