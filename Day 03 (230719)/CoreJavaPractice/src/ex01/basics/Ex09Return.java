package ex01.basics;

public class Ex09Return {
	
	// 
	static int addTwoNumbers(int n1, int n2){
		int total = n1 + n2;
		return total;
	}

	public static void main(String[] args) {
		
		int number1 = 10, number2 = 20;
		
		// int = void

		System.out.println("\n Sum = " + addTwoNumbers(number1, number2));
	}

}
