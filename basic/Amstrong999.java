package basic;

public class Amstrong999 {

	public static void main(String[] args) {
    int number,result,digit1,digit2,digit3;
    int temp;
	 for(number=100;number<=999;number++)
	 {
		 temp=number;
		 
		 digit3=temp%10;
		 temp=temp/10;
		 
		 digit2=temp%10;
		 temp=temp/10;
		 
		 digit1=temp%10;
		 
		 result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
		 if(result==number) {
		 System.out.println(result+ "is an Amstrong number");
		 }
	  }
   }
}
