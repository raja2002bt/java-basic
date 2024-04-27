package basic;
class Matha{
	public static int Mathe(int a,int b) {
		return a*b;
	}
	public static double Mathe(double x,double y) {
		return x*y;
	}
	public static double Mathe(int i,double j) {
		return i*j;
	}
	public static int Mathe(int o) {
		return o;
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		System.out.println(Matha.Mathe(5, 7));
		System.out.println(Matha.Mathe(2.3,5.0));
		System.out.println(Matha.Mathe(9, 6.5));
		System.out.println(Matha.Mathe(8));
	}

}
