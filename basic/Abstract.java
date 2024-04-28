package basic;

abstract class web{
	abstract void pro();
	void display(){
		System.out.println("Display this from web class");
	}
}
class program extends web{

	void pro() {
		System.out.println("Display this from program class");
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		program o=new program();
		o.display();
		o.pro();
	}

}
