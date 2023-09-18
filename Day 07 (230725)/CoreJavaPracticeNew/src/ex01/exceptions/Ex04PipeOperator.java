package ex01.exceptions;

public class Ex04PipeOperator {

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
			
			// Excp producing code block3
			name = "Indore";
			c = name.charAt(10); // 10
			System.out.println("\n 3rd character : " + c);
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("\n Please check data");
			e.printStackTrace();
		}  catch (StringIndexOutOfBoundsException s) {
			System.out.println("\n Cant find a character");
			s.printStackTrace();
		}
				
		System.out.println("\n Complete");
	}

}
