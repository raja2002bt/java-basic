package basic;
class square{
	int length;
	void getdetsils(int x) {
		int length=x;
	}
		int area() {
			int sq=length*length;
			return sq;
		}
	
}
public class Class_Object {

	public static void main(String[] args) {
		square o1=new square();
		o1.length=40;
		System.out.println("Area of Square: "+o1.area());
	}

}
