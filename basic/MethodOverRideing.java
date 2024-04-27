package basic;
class detail{
	String name;
	int age;
	detail(String n,int a){
		this.name=n;
		this.age=a;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
	}
}
class mainprogramming extends detail{
	String company="48";
	mainprogramming(String n,int a,String company){
	super(n,a);
	company=this.company;
	}
	void display() {
		System.out.println("Name    : "+name);
		System.out.println("Age     : "+age);
		System.out.println("Company : "+company);
	}
}
public class MethodOverRideing {

	public static void main(String[] args) {
		mainprogramming o=new mainprogramming("Raja",20,"TN74");
		o.display();
	}

}
