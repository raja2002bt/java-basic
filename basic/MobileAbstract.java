package basic;
abstract class Mobile{
	Mobile(String brand){
		System.out.println("Brand : "+brand);
	}
	void call(){
		System.out.println("Can speak voice call");
		}
	abstract void camera();
	abstract void  display();
	}
class Realme extends Mobile{
	Realme(String brand){
		super(brand);
	}
	void camera() {
		System.out.println("64+8+8 mega pixel camera available");
	}
	void display() {
		System.out.println("18.5inch curved Amoled display");
	}
	
	void features() {
		System.out.println("Side notch is available for better multitasking");
	}
}
class IQOO extends Mobile{
	IQOO(String brand){
		super(brand);
	}

	@Override
	void camera() {
		System.out.println("48+48 mega pixel camera available");
	}

	@Override
	void display() {
		System.out.println("19.6inch Amoled display");		
	}
	
}
public class MobileAbstract {

	public static void main(String[] args) {
		Realme o=new Realme("REALME");
		o.call();
		o.camera();
		o.display();
		o.features();
		System.out.println("---------------------------------");
		IQOO o1=new IQOO("IQOO");
		o1.call();
		o1.camera();
		o1.display();
	}

}
