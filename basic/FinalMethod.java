package basic;
class fnMethod{
	void Super() {
		System.out.println("I am from Super method 1");
	}
	final void FinalSuper() {
		System.out.println("I am from Final Super method");           //Constant Method
	}
	
}
class sub extends fnMethod{
	void Super() {
		System.out.println("I am from Super method 2");              //overriding
	}
//	final void FinalSuper() {                                    
//		System.out.println("I am from Final Super method");          //No Use
//	}
}
public class FinalMethod {

	public static void main(String[] args) {
		sub o1=new sub();
		o1.Super();
		o1.FinalSuper();

	}

}
