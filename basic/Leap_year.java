import java.util.Scanner;
public class Leap_year{
public static void main(String args[]){
int year;
Scanner in=new Scanner(System.in);
year=in.nextInt();
if((year%4==0)||(year%100==0 && year%400==0))
{
System.out.println("Year "+year+" is leap year");
}
else{
System.out.println("Year "+year+" is not a leap year");
}
}
}