/*public class Initilize 
{
public static void main(String args[])
{
int[] number=new number[5];
number[]={1,2,3,4,5}*/

public class Initilize {
    public static void main(String[] args) {
        // Declare an array of integers named numbers with a size of 5
        int[] numbers = {1, 2, 3, 4, 5};

        // Output the elements of the array
        System.out.print("The elements of the array are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
