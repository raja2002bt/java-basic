package basic;

class phone{
	void call() {
		System.out.println("Make calls");
	}
}
interface mobile{
	void camera();
	void display();
}
interface motherboard{
	void charging_port();
	void processor();
}
class assemble extends phone implements mobile,motherboard{

	@Override
	public void charging_port() {
		System.out.println("Type-C");		
	}

	@Override
	public void processor() {
		System.out.println("Mediatec helio g95");		
	}

	@Override
	public void camera() {
System.out.println("128 mbpx");		
	}

	@Override
	public void display() {
System.out.println("Amoled display");		
	}
	
}
public class InterfaceDemo01 {

	public static void main(String[] args) {
		assemble o=new assemble();
		o.call();
		o.camera();
		o.charging_port();
		o.display();
		o.processor();
	}

}
