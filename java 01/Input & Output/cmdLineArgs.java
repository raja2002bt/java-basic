public class cmdLineArgs
{
public static void main (String[] args) {
String str= args[0];
int age=Integer.parseInt(args[1]);
System.out.println("Name :"+str);
System.out.println("Age :"+age);


/*
if(age>=18){
System.out.println(str+" is Eligible");
}
else{
System.out.println(str+" is Not eligible to vote");
}*/

System.out.println(str+" is "+(age >=18 ? "Eligible to vote" : "Not eligible"));


}
}
