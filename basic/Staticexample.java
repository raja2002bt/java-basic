package basic;
class Mathematical{
	public static int power(int base,int power) {
		int result=1;
		for(int i=1;i<=power;i++) {
			result *=base;
		}
		return result;
	}
}

public class Staticexample {

	public static void main(String[] args) {
		System.out.println("Power :"+Mathematical.power(2, 4));

	}

}
//class Mathematical{
//	public static void power(int base,int power) {
//		int result=1;
//		for(int i=1;i<=power;i++) {
//			result *=base;
//		}
//		System.out.println(result);
//	}
//}
//
//public class Staticexample {
//
//	public static void main(String[] args) {
//		Mathematical.power(8,2);
//
//	}
//
//}
