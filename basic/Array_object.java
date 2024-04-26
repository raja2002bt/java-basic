package basic;
class Student{
	int Roll_no=20;
	String Name="Raja";
	Student(String Name,int Roll_no){
		this.Name=Name;
		Roll_no=this.Roll_no;
	}
		void print() {
			System.out.println("Name    :"+Name);
			System.out.println("Roll no :"+Roll_no);
			System.out.println("-------------------------");
		}
}
public class Array_object {

	public static void main(String[] args) {
//		Student o=new Student("Raja",20);
//		o.print();
		Student o1=new Student("Sunil",18);
		o1.print();
//		Student o2=new Student("Pratheep",18);
//		o2.print();
//		Student o3=new Student("Manoj",23);
//		o3.print();
//		Student[] o=new Student[1];
//		o[0]=new Student("Raja",20);
//		o[1]=new Student("Sunil",18);
//		o[2]=new Student("Manoj",23);
//		o[3]=new Student("Pratheep",18);
////		for(int j=0;j<o.length;j++) {
////		o[j].print();
////		}
//		
//		for(Student ans:o) {
//			ans.print();
//		}
		
	}

}
