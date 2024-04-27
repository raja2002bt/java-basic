package basic;

class Mother{
	void home() {
		System.out.println("Have owned a House");             //Base class
	}
}
class Daughter extends Mother{
	void bike() {
		System.out.println("Have owned a Bike");              //Derived class
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Daughter o=new Daughter();
		o.home();
		o.bike();
	}

}
