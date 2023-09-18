package ex01.exceptions;

public class Ex06CustomExceptionDemo {
	static void withdrawal(int balanceAmount, int withdrawalAmount) 
			throws InsufficientFundsException {

		if (withdrawalAmount <= balanceAmount) {
			System.out.println("Fine");
		} else {
			System.out.println("not fine");
			throw new InsufficientFundsException("Balance too low");
		}

	}

	public static void main(String[] args) {
		System.out.println("\n Start");
		int balanceAmount = 10000;
		int withdrawalAmount = 11000;

		try {
			withdrawal(balanceAmount, withdrawalAmount);
		} catch (InsufficientFundsException e) {

			// show the message we passed
			System.out.println(e.getMessage());
			// technical message
			e.printStackTrace();
		}

		System.out.println("\n Complete");
	}
}
