package basic;

class Box {
	int length, height;

	Box() {                                    //default constructor
		length = 35;
		height = 50;
	}

	Box(int x, int y) {                         //Parametarized constructor
		length = x;
		height = y;
	}

	Box(int x) {
		length = height = x;
	}

	int area() {
		int a = length * height;
		return a;
	}
}

public class Paramaterized_Constructor {

	public static void main(String[] args) {
		Box o1 = new Box();
		System.out.println(o1.area());

		Box o2 = new Box(10, 25);
		System.out.println(o2.area());

		Box o3 = new Box(10);
		System.out.println(o3.area());

	}

}
