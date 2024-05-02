package basic;

class outer {
	int a = 40;

	class inner {
		int b = 39;

		void innerdisplay() {
			System.out.println("a :" + a);
			System.out.println("b :" + b);
		}
	}

	void outerdisplay() {
		inner o = new inner();
		o.innerdisplay();
		System.out.println("A :" + a);
		System.out.println("B :" + o.b);
	}
}

public class NestedClass {

	public static void main(String[] args) {
		outer o = new outer();
		o.outerdisplay();
		outer.inner p = new outer().new inner();
		p.innerdisplay();

	}

}
