import java.util.Scanner;

public class Inputdemo
{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("What is your name ?");
String name = sc.next();

System.out.println("What's your rating from 1 to 5 ?");
int rating =sc.nextInt();
sc.nextLine();

System.out.println("Enter your email:");
String email = sc.nextLine();


System.out.println("Hi.. "+name );
System.out.println("You rate us : "+rating );
System.out.println("Email : "+email );

}
}