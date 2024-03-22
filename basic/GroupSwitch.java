package basic;
import java.util.Scanner;
public class GroupSwitch {

	public static void main(String[] args) {
		char ch;
		Scanner var=new Scanner(System.in);
		System.out.print("Enter an alphabet :");
		ch=var.next().charAt(0);
		switch (ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(ch+" is a Vowels");
			break;
			default:
				System.out.println(ch+" is a Consonent");
			break;
		}

	}

}
