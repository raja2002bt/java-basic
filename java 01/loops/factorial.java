public class factorial {
    public static void main(String[] args) {
        int N = 10;
        for (int i = 1; i <= N; i++) {
            long factorial = calculateFactorial(i);
            System.out.println("Factorial of " + i + " is: " + factorial);
        }
    }
    
    // Function to calculate factorial of a number
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
