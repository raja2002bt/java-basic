package basic;
class Method {
			//no Return w/o arguments
	public void add() {
		int a=10;
		int b=20;
		System.out.println("Addition :"+(a+b));
	}
	
			//no Return with arguments
	public void Sub(int x,int y) {
		System.out.println("Subraction :"+(x-y));
	}
	
			//Return without arguments
	public int mul() {
		int a=9;
		int b=8;
		return a*b;
	}
			//Return with arguments
	public float div(float a,float b) {
		return a/b;
		
	}
			//Recurssion Function
	public int Fact(int n) {
		if(n==1)
			return 1;
		else
			return(n*Fact(n-1));
		
	}
}
public class Function{
	public static void main(String[] args) {
		Method o=new Method();
		o.add();
		o.add();
		o.Sub(50, 30);
		System.out.println("Multiplication :"+o.mul());
		System.out.println("division :"+o.div(4,5));
		System.out.println("Factorial :"+o.Fact(5));
		

	}

}