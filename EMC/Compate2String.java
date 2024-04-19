package EMC;

public class Compate2String {

	public static void main(String[] args) {
		String a="Pencil";
//		String b="Pencil";
		String c=new String("Pencil");
		
		if(a.equals(c)) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equal");
		}

	}

}
