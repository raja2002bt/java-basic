package basic;

class Complex{
	private int real,img;
	Complex(){
		real=10;
		img=20;
	}
	Complex(int x,int y){
		real=x;
		img=y;
	}
	Complex(Complex o2){
		real=o2.real;
		img=o2.img;
	}
	
	public String toString() {
		return "("+real+"+"+img+"i)";
	}
	
}
public class CopyConDemo {

	public static void main(String[] args) {
		Complex o1=new Complex();
		System.out.println(o1);
		Complex o2=new Complex(10,30);
		System.out.println(o2);
		Complex o3=new Complex(o2);
		System.out.println(o3);
		
	}

}
