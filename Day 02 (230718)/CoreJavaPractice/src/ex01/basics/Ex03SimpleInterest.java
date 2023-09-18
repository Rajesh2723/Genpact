package ex01.basics;

public class Ex03SimpleInterest {

	public static void main(String[] args) {
		long principal = 50000;
		float rateOfInterest = 8.5f;
		float noOfYears = 10.5F;

		// Eclipse key -> Ctrl + Space to generate suggestions
		float simpleInterest = (principal * rateOfInterest * noOfYears) / 100;

		float amount = principal + simpleInterest;

		// type syso and then Ctrl + space to generate System.out.println()
		System.out.println("\n Simple Interest = " + simpleInterest);
		System.out.println("\n Amount = " + amount);

	}

}
