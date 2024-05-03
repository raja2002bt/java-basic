package basic;
class TestStatic{
	static{
		System.out.println("TestBlock-1");
	}
	static{
		System.out.println("TestBlock-2");
	}
}
public class StaticBlock {
	static{
		System.out.println("Block-1");
	}
	public static void main(String[] args) {
		TestStatic o=new TestStatic();
		System.out.println("Main");

	}
	static{
		System.out.println("Block-2");
	}

}
