package ex01.exceptions;

public class Ex03TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("\n Start");

		try {
			// Excp producing code block1
			int num = 10;
			int div = 1; // 0
			int result = num / div;
			System.out.println("\n Result = " + result);

			// Excp producing code block2
			String name = "Indore"; // null
			char c = name.charAt(3);
			System.out.println("\n 4th character : " + c);
			
			// Ex04PipeOperator
			
			// Excp producing code block3
			name = "Indore";
			c = name.charAt(10); // 10
			System.out.println("\n 3rd character : " + c);
		} catch (ArithmeticException e) {
			System.out.println("\n Dividing by 0 not allowed");
			e.printStackTrace();
		} catch (NullPointerException n) {
			System.out.println("\n Data not received");
			n.printStackTrace();
		} catch (StringIndexOutOfBoundsException s) {
			System.out.println("\n Cant find a character");
			s.printStackTrace();
		}
				
		System.out.println("\n Complete");
	}

}
