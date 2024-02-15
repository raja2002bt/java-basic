public class arri
{
public static void main (String args[])
{
int valueToBeAdded = 5;
int arr[]={1,2,3};
int newArray[]= new int[arr.length+1];
for(int i=0;i<arr.length;i++) {
newArray[i]=arr[i];
}
newArray[arr.length-1]=valueToBeAdded;
for(int i=0;i<newArray.length;i++)
System.out.println(newArray[i]);
}
}

