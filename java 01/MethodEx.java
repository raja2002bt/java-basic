public class MethodEx {
String global = "global variable";


public static void printHelloWorld(){
System.out.println("Hello");
}


public static void printHelloWorld(String data){
System.out.println(data);
}
boolean isvotingEligible(int age){
boolean result=false;
if(age>=18){
result=true;
}
return result;
}



public static void main(String[] args){
String local="Hello Soilders";


printHelloWorld();
printHelloWorld(local
boolean votingEligibility=new MethodEx().isvotingEligible(20);
System.out.println(votingEligibility);
}
} 
