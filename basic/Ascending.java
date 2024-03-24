package basic;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		int[] a={86,45,75,23,12,58};
		System.out.println("Before Sort :"+Arrays.toString(a));
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])    //ascending 
//				if(a[i]<a[j])    //descending
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		  }
		}
		System.out.println("After Sort :"+Arrays.toString(a));
	  
	}

}
