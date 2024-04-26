package basic;
class rectangle{
	private int length,breadth;
		void getdetails(int x,int y) {
		 length =x;
		 breadth=y;
	}
		int area(){
		int	a=length*breadth;
		return a;
		}
}
public class Classes {

	public static void main(String[] args) {
		rectangle o1=new rectangle();
		o1.getdetails(10,20);
//		o1.breadth=20;
		System.out.println("Area of Rectangle:"+o1.area());
		
//		rectangle o2=new rectangle();
//		o2.length=40;
//		o2.breadth=50;
//		System.out.println("Ar  ea of Rectangle:"+o2.area());
	}

}
