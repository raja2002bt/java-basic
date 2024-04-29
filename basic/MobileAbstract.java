package basic;
abstract class Mobile1{
	Mobile1(String brand){
		System.out.println("Brand : "+brand);
	}
	void call(){
		System.out.println("Can speak voice call");
		}
	abstract void camera1();
	abstract void  display1();
	}
class Realme extends Mobile1{
	Realme(String brand){
		super(brand);
	}
	void camera1() {
		System.out.println("64+8+8 mega pixel camera available");
	}
	void display1() {
		System.out.println("18.5inch curved Amoled display");
	}
	
	void features() {
		System.out.println("Side notch is available for better multitasking");
	}
}
class IQOO1 extends Mobile1{
	IQOO1(String brand){
		super(brand);
	}

	@Override
	void camera1() {
		System.out.println("48+48 mega pixel camera available");
	}

	@Override
	void display1() {
		System.out.println("19.6inch Amoled display");		
	}
	
}
public class MobileAbstract {

	public static void main(String[] args) {
		Realme o=new Realme("REALME");
		o.call();
		o.camera1();
		o.display1();
		o.features();
		System.out.println("---------------------------------");
		IQOO1 o1=new IQOO1("IQOO");
		o1.call();
		o1.camera1();
		o1.display1();
	}

}
