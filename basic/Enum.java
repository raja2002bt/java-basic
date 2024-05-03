package basic;

public class Enum {
	enum levelinfo {
		low, medium, high;
	}

	public static void main(String[] args) {
		levelinfo a = levelinfo.medium;
		System.out.println(a);

		switch (a) {
		case low:
			System.out.println("Low");
			break;
		case medium:
			System.out.println("Medium");
			break;
		case high:
			System.out.println("High");
			break;
		}
		for (levelinfo a1 : levelinfo.values()) {
			System.out.println(a1);
		}

	}
}
