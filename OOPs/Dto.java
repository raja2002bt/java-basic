class Student {

private String name;
private String age;

public String getName(){
	return name;
}

public void setName(String name) {
this.name = name;
}

public String getage(){
	return age;
}

public void setAge(String age) {
this.age = age;
}

}

public class Dto {
public static void main(String[] args) {

	Student one=new Student();
	one.setName("Raja");
        one.setAge("22");
	System.out.println(one.getName());
	System.out.println(one.getAge());
	
	Student two=new Student();
	two.setName("Pratheep");
        two.setAge("20");
	System.out.println(two.getName());
        System.out.println(two.getAge());

        Student three=new Student();
	three.setName("Manoj");
        three.setAge("24");
	System.out.println(three.getName());
	System.out.println(three.getAge());
}
}