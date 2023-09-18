package ex01.exceptions;

public class Ex05ThrowThrows {
	static void withdrawal(int balanceAmount, int withdrawalAmount) throws ArithmeticException {

		if (withdrawalAmount <= balanceAmount) {
			System.out.println("Fine");
		} else {
			System.out.println("not fine");
			ArithmeticException a = new ArithmeticException("Balance too low");
			throw a;
		}

	}

	public static void main(String[] args) {
		System.out.println("\n Start");
		int balanceAmount = 10000;
		int withdrawalAmount = 11000;
		
		try {
			withdrawal(balanceAmount, withdrawalAmount);
		} catch (ArithmeticException e) {
			System.out.println("Message");
		}
	
		System.out.println("\n Complete");
	}
}
