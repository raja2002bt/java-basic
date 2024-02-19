public class Max1{
public static int findMax(int[] arr) {
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
if (arr[i] > max) {
max = arr[i];
}
}
return max;
}
public static void main(String[] args) {
int[] arr = new int[]{7,4,20,15};
int maxElement = findMax(arr);
System.out.println("Maximum element is: " + maxElement);
}
}