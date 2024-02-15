import java.io.Console;
public class PassConsole 
{
public static void main (String args[]) 
{
Console con = System.console();
while(true){
System.out.print("Enter Username :");
String name = con.readLine();
System.out.print("Enter Password:");
char[] password = con.readPassword();
String passwordAsString ="";
for(int j=0; j<password.length;j++)
{
passwordAsString += password[j];
}
 if(name.equals("Raja") && "Abc@123".equals(passwordAsString)) {
System.out.println("Login Successful!..");
break ;
} else {
System.out.println("Incalid Username or password");
}
}
}
}