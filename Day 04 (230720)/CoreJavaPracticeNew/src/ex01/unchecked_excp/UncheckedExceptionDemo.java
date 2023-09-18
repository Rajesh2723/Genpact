package ex01.unchecked_excp;

// Syntax Error - Errors that arise from wrong syntax (compile time error)
// Warning - Intimation to structure the code
// Semantic/Logical Error - Detected by Testing the code by execution/observation
// Runtime Error
// Exception is nothing but run time errors


//1. JRE creates an object of ArithmeticException class
		// ArithmeticException a = new ArithmeticException();
		
		// 2. JRE throws this exception
		// throw a;


public class UncheckedExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("\n Start");
		
		int num = 10;
		int div = 0;
		
		int result = 0;
		
		try {
			result = num / div; 
		} catch (ArithmeticException a1) { // a1 = a
			System.out.println("\n Exception caught");
		}
		
		System.out.println("\n Result = " + result);
		
		System.out.println("\n Complete");
	}

}
