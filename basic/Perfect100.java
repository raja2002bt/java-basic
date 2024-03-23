package basic;

public class Perfect100 {

	public static void main(String[] args) {
		int sum=0;
		for(int n=1;n<=1000;n++) {
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println(n+" is a Perfect number");
		}
		sum=0;
	  }

	}

}
