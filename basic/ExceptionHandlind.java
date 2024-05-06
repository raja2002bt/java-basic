package basic;

public class ExceptionHandlind {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=0;
		try {
			int arr[]=null;
		     System.out.println(arr[1]);
			c=a/b;
			System.out.println("Tryblock");
		}
		catch(ArithmeticException e) {
			System.err.println("Arithmetic Exception Error Occured");
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer Exception Error Occured");
		}
		catch(Exception e) {
			System.out.println("Error occured");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println(c);
		System.out.println("End of program");

	}

}
