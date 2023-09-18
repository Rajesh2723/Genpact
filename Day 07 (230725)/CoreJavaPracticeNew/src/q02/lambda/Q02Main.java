package q02.lambda;

public class Q02Main {

	public static void main(String[] args) {
		
		SimpleInterest s = (principal, rateOfInterest, noOfYears) -> (principal * rateOfInterest * noOfYears)/100;
		System.out.println("\n Simple Interest : " + s.calculateSi(10000, 8.5, 5));
		
	}

}
