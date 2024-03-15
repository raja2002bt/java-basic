class fibo{
public static void main(String[] args) {
int n1 = 0, n2 = 1, n3, i, num = 10;
System.out.print(n1 + " " + n2);
for (i = 0; i < num; ++i) 
{
n3 = n1 + n2;
n1=n2;
n2=n3;
System.out.print(" " + n3);

}
}
}
