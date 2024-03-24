package basic;

public class CheckDuplicate {

	public static void main(String[] args) {
	int[]a=new int[] {5,9,6,6,1,8,3,4,8,1};
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if ((a[i]==a[j])&&(i!=j)){
				System.out.println("Duplicate value :"+a[j]);
			}
		  }
	   }
	}
}
