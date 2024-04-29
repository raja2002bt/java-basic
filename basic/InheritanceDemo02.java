package basic;

interface interdemo{
	static final int a=77;
	public static final String f6 = "";
	public abstract void fun1();
	public abstract void fun2();
	public static void fun3(){
		System.out.println("I am in fun 3");
	}
	private void fun6() {
		String f6="fun6";
	}
	default void fun5() {
		System.out.println("fun5"+f6);
	}
}

interface interdemo1 extends interdemo{
	
	void fun4();
	
}

class testinter implements interdemo1{

	@Override
	public void fun1() {
		System.out.println("fun1");
	}

	@Override
	public void fun2() {
		System.out.println("fun2");
		
	}

	@Override
	public void fun4() {
		System.out.println("fun4");
		
	}
	
}

public class InheritanceDemo02 {

	public static void main(String[] args) {
		System.out.println("A : "+interdemo.a);
		interdemo.fun3();
		testinter o=new testinter();
		o.fun1();
		o.fun2();
		o.fun4();
		o.fun5();
	}

}
