public class Cube {
public static void main (String args[]) {
int n=10;
for( int i=1;i<=n;i++){
int cube = calculatecube(i);
System.out.println("Cube of "+i+" is "+cube);
}
}
public static int calculatecube(int n){
return n*n*n;
}
}