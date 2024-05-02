package basic;

abstract class outcls {
	abstract void out();
}

class outcls2 {
	public void out2cls() {
		outcls o = new outcls() {

			@Override
			void out() {
				System.out.println("Lets Start..");

			}

		};
		o.out();
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		outcls2 p = new outcls2();
		p.out2cls();
	}

}
