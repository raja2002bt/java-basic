package basic;

class Three{
	static int a=10;
	int b=20;
	void thr(){
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	static void thre() {
		System.out.println("A : "+a);
//		System.out.println("B : "+b);
	}
}
public class StaticVarianle_Instance {

	public static void main(String[] args) {
		Three o1=new Three();
		o1.thr();
		Three o2=new Three();
		o2.b=200;
		Three.a=100;
		o2.thr();
		o1.thr();
	}

}
