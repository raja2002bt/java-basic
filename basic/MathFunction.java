package basic;

public class MathFunction {

	public static void main(String[] args) {
		System.out.println("Absolute value : "+Math.abs(-50));
		System.out.println("Round value : "+Math.round(2.5888));
		System.out.println("Round value : "+Math.round(2.2888));
		System.out.println("Ceil value : "+Math.ceil(2.2888));
		System.out.println("Ceil value : "+Math.ceil(2.5888));
		System.out.println("Floor value : "+Math.floor(2.5888));
		System.out.println("Floor value : "+Math.floor(2.2888));
		
		double a=2;
		double b=5;
		System.out.println("Maximum no of a and b is : "+Math.max(a, b));
		System.out.println("Square root of a and b is : "+Math.sqrt(b));
		System.out.println("Power of a and b is : "+Math.pow(a, b));
		System.out.println("Logerthm of a and b is : "+Math.log(a));
		System.out.println("Log10 of a and b is : "+Math.log10(a));
		System.out.println("Sine of a is : "+Math.sin(b));
		System.out.println("Cosine of a is : "+Math.cos(b));
		System.out.println("Tangent of a is : "+Math.tan(b));
		
	}

}
