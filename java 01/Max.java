public class Max{
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
        int[] arr = {2, 8, 4, 12};
        int maxElement = findMax(arr);
        System.out.println("Maximum element in the array is: " + maxElement);
    }
}