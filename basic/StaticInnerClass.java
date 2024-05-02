package basic;
class one{
	static int x=5;
	static int y=8;
	static class two{
		 void Dis() {
			System.out.println("A :"+x);
			System.out.println("B :"+y);
		}
	}
}
public class StaticInnerClass {
	public static void main(String[] args) {
		one.two o=new one.two();
				o.Dis();
	}
}
