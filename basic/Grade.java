package basic;

import java.util.Scanner;
public class Grade{
public static void main (String args[]){
float mark;
System.out.print("Enter your mark :");
Scanner in=new Scanner(System.in);
mark=in.nextFloat();
if (mark>=90 &&  mark<=100)
{
System.out.println("Grade A");
} 
else if (mark>=80 &&  mark<=89)
{
System.out.println("Grade B");
}
else if (mark>=70 &&  mark<=79)
{
System.out.println("Grade C");
} 
else
{
System.out.println("Grade D");
} 
}
}