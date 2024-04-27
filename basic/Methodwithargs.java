package basic;

import java.util.Arrays;

public class Methodwithargs {
	public static void Name(String... names) {
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
		
		for(String name:names) {
			System.out.println(name);
		}
			System.out.println(Arrays.toString(names));
	}
	public static void main(String[] args) {
		Name("Raja","Sunil","Manoj","Pradeep");
	}

}
