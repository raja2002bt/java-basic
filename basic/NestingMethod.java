package basic;
class Nesting{
	private int m,n;
	Nesting(int x,int y){
		m=x;
		n=y;
	}
	int largest(){
		if(m>n) 
			return m;
		else
			return n;
	}
	void display() {
		int large=largest();
		System.out.println("Largest no: "+large);
	}
}
public class NestingMethod {

	public static void main(String[] args) {
	Nesting o=new Nesting(100,30);
	o.display();

	}

}
