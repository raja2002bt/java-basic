
class a{
public int a=10;
}
public class b extends a
{
public static int a=15;
void printData(int a){
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}
public static void main(String args[]){
new b().printData(20);
}
}

