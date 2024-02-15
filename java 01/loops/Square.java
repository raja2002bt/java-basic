public class Square
{
public static void main(String args[])
{
int n=10;
for(int i=1;i<=n;i++){
 
 int square = calculateSquare(i);
            System.out.println("Square of " + i + " is: " + square);
        }
    }
    
   
 public static int calculateSquare(int n) {
        return n * n;
    }
}

