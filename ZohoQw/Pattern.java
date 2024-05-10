package ZohoQw;

public class Pattern {

	public static void main(String[] args) {
//		for (int j = 1; j <= 5; j++) {                  //1
//			for (int i = 1; i <= j; i++) {				//12
//				System.out.print(i);					//123
//			}											//1234
//			System.out.println(" ");					//12345
//		}
		
//		for (int j = 1; j <= 5; j++) {                  //12345
//			for (int i = j; i <= 5; i++) {				//2345
//				System.out.print(i);					//345
//			}											//45
//			System.out.println(" ");					//5
//		}
		
		
//		for (int j = 1; j <= 5; j++) {                  //1
//			for (int i = 1; i <= j; i++) {				//22
//				System.out.print(j);					//333
//			}											//4444
//			System.out.println(" ");					//55555
//		}
		
		
		
//		for (int j = 5; j >=1 ; j--) {                  //55555
//			for (int i = 1; i <= j; i++) {				//4444
//				System.out.print(j);					//333
//			}											//22
//			System.out.println(" ");					//1
//		}
			
		
		
		for (int j = 1; j <= 5; j++) {                  //5
			for (int i = 5; i >= 1; i--) {				//54
				System.out.print(i);					//543
			}											//5432
			System.out.println(" ");					//54321
		}
		
//		for (int j = 1; j <= 5; j++) {                  //54321
//			for (int i = 5; i >= j; i--) {				//5432
//				System.out.print(i);					//543
//			}											//54
//			System.out.println(" ");					//5
//		}

	}

}
