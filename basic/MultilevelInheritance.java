package basic;
class grandfather{
	public void plot() {
		System.out.println("Hava owned 5 acrs of land ");     //Base class
	}
}
class father extends grandfather{
	public void home() {
		System.out.println("Have owned a House");             //derived class//Base class
	}
}
class son extends father{
	public void bike() {
		System.out.println("Have owned a Bike");              //Derived class
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		son o=new son();
		o.plot();
		o.home();
		o.bike();
		
	}

}
