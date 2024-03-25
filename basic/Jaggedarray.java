package basic;

public class Jaggedarray {

	public static void main(String[] args) {
		int a[][]= {
				{10,20,30,40,50},
				{20,40,80},
				{30,60,90,120,150}};
		for(int i=0;i<a.length;i++) {                           //row
			for(int j=0;j<a[i].length;j++) {                    //column
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}
