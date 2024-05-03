package basic;
class FINAL{
	final int MIN=1;                              //Constant
	final int NORMAL;
	final int MAX;
	FINAL(int normal){
		NORMAL=normal;
		MAX = 100;
	}
	void display() {
		System.out.println(MIN);
		System.out.println(NORMAL);
		System.out.println(MAX);
	}
}
public class FinalVariable {

	public static void main(String[] args) {
		FINAL o=new FINAL(50);
		o.display();
	}

}
