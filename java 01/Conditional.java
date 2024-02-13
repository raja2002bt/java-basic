public class Conditional
{
public static void main(String[] args)
{
int m1=100,m2=100,m3=100;
int total=m1+m2+m3;
float avg=total/3;
if (avg<50)
{
System.out.println("Fail,Keep practice...");
}
else if(avg>50 && avg<=60)
{
System.out.println("Your mark is pass :c");
}
else if(avg>60 && avg<=70)
{
System.out.println("Your mark is good :b+");
}
else if(avg>70 && avg<=80)
{
System.out.println("you are below average :b");
}
else if(avg>80 && avg<=90)
{
System.out.println("you are average :a");
}
else if(avg>90 && avg<=100)
{
System.out.println("you are distinction! :a+");
}
}
}