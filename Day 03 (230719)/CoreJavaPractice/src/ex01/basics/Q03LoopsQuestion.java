package ex01.basics;

public class Q03LoopsQuestion {

	public static void main(String[] args) {
		// power
		int number = 3, power = 7;
		
		int i = 1;
		int result = 1;
		
//		while(i <= power) {
//			result *= number;// result = result * number
//			i++;
//		}
		
		do {
			result *= number;
			i++;
		} while (i<=power);
		
		System.out.println("\n Result = " + result);

	}

}
