package basic;

import basic.outer.inner;

class outercls {
		int a=15;
	void outcls() {
		class inner {
			int b=10;
			void innerdis() {
				System.out.println(a);
				System.out.println(b);
			}
			
		}
		inner o=new inner();
		o.innerdis();
	}

}

public class LocalClass {

	public static void main(String[] args) {
		outercls p=new outercls();
		p.outcls();
	}

}
