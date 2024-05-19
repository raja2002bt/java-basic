import java.util.Arrays;
import java.util.Scanner;

public class array_function{

    public  int[] sortArray() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a Limit : ");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter a number : ");
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        return a;
    }
    public static void main(String[] args) {
        array_function obj=new array_function();
//		int arr[]=obj.sortArray();
//		System.out.println(Arrays.toString(arr));
        for (int a: obj.sortArray())
            System.out.print(a+" ");
    }
}