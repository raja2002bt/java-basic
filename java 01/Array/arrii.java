public class arrii
{
public static void main (String args[])
{
int arr[]={1,2,3,4};
int newArray[]= new int[arr.length-1];
for(int i=0;i<arr.length;i++) {
newArray[i]=arr[i];
}
for(int i=0;i<newArray.length;i++)
System.out.println(newArray[i]);
}
}

