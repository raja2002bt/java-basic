public class SumSquare
{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int sum=0;
for(int i=1;i<=n;i++){
int square=i*i;
sum += square;
}
System.out.println("The sum of the squares of numbers from 1 to "+n+" is: " + sum);
}
}
