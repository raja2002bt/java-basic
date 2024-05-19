import java.util.Arrays;
import java.util.Scanner;

public class Sort_the_number {
    public static void main(String[] args) {

        //input
        Scanner in =new Scanner(System.in);
        System.out.print("Enter a limit : ");
        int limit=in.nextInt();
        int array []=new int[limit];

        for (int i=0;i<array.length;i++){
            System.out.print("Enter a number :");
            array[i]=in.nextInt();
        }

        //Sorting
        int temp;
        for(int j=0;j<array.length;j++){
            for (int k=j;k<array.length;k++){
                if (array[j]>array[k]){
                    temp=array[j];
                    array[j]=array[k];
                    array[k]=temp;
                }
            }
        }

        //output
        for (int e:array){
            System.out.print(e);
        }

    }
}