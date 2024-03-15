interface Addition{
int add(int a,int b);
}
public class Main implements Addition
{
public int add(int a,int b){
return a+b;
}
public static void main(String[] args) {
Addition m=new Main();
System.out.println(m.add(10,20));
}
}