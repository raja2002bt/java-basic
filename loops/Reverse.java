
public class Reverse {
public static void main(String args[]) {
int n= Integer.parseInt(args[0]);
System.out.println("Numbers from " + n + " to 1 in reverse order:");
for(int i=n;i>=1;i--){
System.out.println(i);
}
}
}

/*import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();
        
        System.out.println("Numbers from " + N + " to 1 in reverse order:");
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
*/