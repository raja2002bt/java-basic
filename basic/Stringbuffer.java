package basic;

public class Stringbuffer {
public static void main(String[] args) {
	//Stringbuffer && Stringbuilder
	
	StringBuffer buffer=new StringBuffer("Programmer");
	System.out.println(buffer);
	buffer.append(" Raja");
	System.out.println("Append :"+buffer);
	buffer.insert(11, "Developer ");
	System.out.println("insert :"+buffer);
	buffer.replace(11, 19, "Nirmal");
	System.out.println("replace :"+buffer);
	buffer.delete(11, 19);
	System.out.println("delete :"+buffer);
	System.out.println("Reverse :"+buffer.reverse());
	System.out.println("CharAt :"+buffer.charAt(11));
	System.out.println("Length :"+buffer.length());
	System.out.println("Substring :"+buffer.substring(10));
	System.out.println("Substring :"+buffer.substring(0,10));
	buffer.setCharAt(0, 'r');;
	System.out.println("SetChatAt :"+buffer);
	
	StringBuffer first=new StringBuffer();
	System.out.println(first.capacity());
	first.append("Hello");
	System.out.println(first.capacity());
	first.append("Java is my favourate language");
	System.out.println(first.capacity());
}
}
