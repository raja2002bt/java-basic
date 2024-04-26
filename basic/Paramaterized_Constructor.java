package basic;

class Box {
	private int length, height;

	Box() {  //default constructor
		length = 10;
		height = 50;
	}

//	Box(int x, int y) {                         //Parametarized constructor
//		length = x;
//		height = y;
//	}
//	
//	Box(Box o2) {                               
//		length = o2.length;
//		height = o2.height;
//	}
//
//	Box(int x) {
//		length = height = x;
//	}

	public String toString() {
//		return "("+length+"+"+height+"i)";
		int a = length * height;
		
		return String.valueOf(a);
	}
}

public class Paramaterized_Constructor {

	public static void main(String[] args) {
		Box o1 = new Box();
		System.out.println(o1);

//		Box o2 = new Box(10, 25);
//		System.out.println(o2.area());
//
//		Box o3 = new Box(10);
//		System.out.println(o3.area());
//		
//		Box o4 = new Box(o2);
//		System.out.println(o4.area());

	}

}
