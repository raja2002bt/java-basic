package basic;
class shapeRectangle{
	int length ,width;
	public shapeRectangle(){
		System.out.println("Constructor Called");
		length=10;
		width=20;
	}
	int area() {
		int a=length*width;
		return a;
	}
}

public class Constructor {

	public static void main(String[] args) {
		shapeRectangle o1= new shapeRectangle();
		System.out.println(o1.area());

	}

}
