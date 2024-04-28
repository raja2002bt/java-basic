package basic;
interface animal{
	
	void dog();
	void cat();
}
class behaviour implements animal{

	@Override
	public void dog() {
System.out.println("dog bark like 'woof'");		
	}

	@Override
	public void cat() {
		System.out.println("dog bark like 'meow'");		
	}
	
}
public class InterfaceAmimal {

	public static void main(String[] args) {
		behaviour o =new behaviour();
		o.cat();
		o.dog();

	}

}
