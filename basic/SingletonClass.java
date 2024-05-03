package basic;

class ABC {
	static ABC obj = null;

	private ABC() {
	}

	public static ABC instanceobj() {
		if (obj == null)
			obj = new ABC();
		return obj;
	}

	void Display() {
		System.out.println("'I AM SINGLETON CLASS'");
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		ABC o = ABC.instanceobj();
		o.Display();

	}

}
