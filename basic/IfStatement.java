import java.util.Scanner;
public class IfStatement
{
public static void main(String args[])
{
int age;
Scanner in=new Scanner(System.in);
age=in.nextInt();
if(age>=18)
{
System.out.println("You are Eligible to vote");
}
}
}