package q02.math_op;

public class Q02Main {

	public static void main(String[] args) {
		MathOperation mathOp = new MathOperation();
		
		double result = 0;
		
		result = mathOp.multiply(10, 12);
		System.out.println("\n Result = " + result);
		
		result = mathOp.multiply(10.1f, 2.3f, 11f);
		System.out.println("\n Result = " + result);
		
		result = mathOp.multiply(100.76, 20);
		System.out.println("\n Result = " + result);
	}

}
