import java.io.BufferedReader;
import java.io.InputStreamReader;

class NameException extends Exception{
}
public class Exphal
{
public static void testThrow() throws NameException{
throw new NameException();
}
public static void main(String[] args){
try{
testThrow();
}
catch(NameException e) {
System.out.println("name Exception");
e.getMessage();
}
}
}