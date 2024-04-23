package basic;

class haperectangle {

	private static int length, width;

	int getLength() { // Get
		return length;
	}

	int getWidth() {
		return width;
	}

	void setLength(int l) { // Set
		if (l > 0)
			length = l;
		else
			length = 0;
	}

	void setWidth(int w) {
		if (w > 0)
			width = w;
		else
			width = 0;
	}

	int area() {
		int a = length * width;
		return a;
	}
}

public class Get_Set {
	public static void main(String[] args) {
		haperectangle o = new haperectangle();
		o.setLength(40);
		o.setWidth(20);
		System.out.println("length : " + o.getLength());
		System.out.println("Width : " + o.getWidth());
		System.out.println("Area of Rectangle : " + o.area());

	}
}