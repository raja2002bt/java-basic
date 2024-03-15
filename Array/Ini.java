
public class Ini 
{
public static void main(String args[])
{
int number[]={1,2,3,4,5};
	
//number[1]=10;


//int sum =0;

//for(int i=0;i<number.length;i++) {
//sum +=number[i];
//}
//double average = sum / number.length;
//System.out.print(average);

//System.out.println(number.length);


int max=number[0];
for(int i=1;i<number.length;i++) {
if(number[i]>max){
 max=number[i]; }
}
System.out.print(max);


//System.out.println(number[2]);

}
}

