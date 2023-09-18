package ex01.basics;

public class Ex04LogicalOperator {

	public static void main(String[] args) {
		// & , |
		
		// In an office, incentive is to be given
		// If years of service >= 10, If salary >= 10000
		// Incentive will be given
		// if years of service < 10, salary <10000, no incentive
		
		int yearsOfService = 6;
		int salary = 11000;
		
		System.out.println(yearsOfService >= 10);
		System.out.println(salary >=10000);
		System.out.println(yearsOfService >= 10 | salary >=10000);
		// false, salary >=10000 will not be checked
		if(yearsOfService >= 10 && salary >=10000) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not eligible");
		}
		
		boolean isPresent = true;
		boolean isAbsent = !isPresent;
		System.out.println(isPresent);
		System.out.println(isAbsent);

	}

}
