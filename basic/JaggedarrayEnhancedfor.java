package basic;

public class JaggedarrayEnhancedfor {

	public static void main(String[] args) {
		int a[][]= {
				{10,20,30,40,50},
				{20,40,80},
				{30,60,90,120,150}};
		for(int k[] : a) {
			for(int l:k) {
			System.out.print(" "+l);
		}
			System.out.println();
		}
	}

}
