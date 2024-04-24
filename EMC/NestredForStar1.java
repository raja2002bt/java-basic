package EMC;

public class NestredForStar1 {

	public static void main(String[] args) {

//		for(int j=1;j<=4;j++) {                //***
//			for(int i=1;i<=4;i++) {            //***
//				System.out.print("*");         //***
//			}
//			System.out.println("");}

//		for(int j=1;j<=4;j++) {                //*
//			for(int i=1;i<=j;i++) {            //**
//				System.out.print("*");         //***
//			}
//			System.out.println("");}

//		for(int j=1;j<=4;j++) {                //***
//		for(int i=4;i>=j;i--) {                //**
//			System.out.print("*");             //*
//		}
//		System.out.println("");}
		
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print(" ");
//			}                                  //   *
//			for(int k=1;k<i;k++) {             //  ***
//				System.out.print("*");         // *****
//			}                                  //*******
//			for(int l=1;l<=i;l++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}			
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}                                  //    *
			for(int k=1;k<i;k++) {             //   ***
				System.out.print("*");         //  *****
			}                                  // *******
			for(int l=1;l<=i;l++) {            //*********
				System.out.print("*");         //*********
			}                                  //*********
			System.out.println("");            //*********
		}		
		for(int j=1;j<=5;j++) {               
		for(int i=1;i<=9;i++) {            
			System.out.print("*");         
		}
		System.out.println("");}
		
	}

}
