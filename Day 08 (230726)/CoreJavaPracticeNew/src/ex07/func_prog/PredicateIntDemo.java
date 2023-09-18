package ex07.func_prog;

import java.util.function.Predicate;

public class PredicateIntDemo {

	public static void main(String[] args) {
		// I want to check whether a String is null or not

		//                              definition of boolean test(String str)
		Predicate<String> checkForNull = str -> str == null;

		String input = "Genpact";
		System.out.println(checkForNull.test(input));
		
		input = null;
		System.out.println(checkForNull.test(input));
		
		// return true, if totalSalary >= 50000 otherwise false
		Predicate<Employee> eligibleForIncentive = 
				e -> (e.getBs() + e.getAdd() - e.getDed()) >= 50000; 

		Employee emp1 = new Employee(40000, 2000, 3000);
		
		if(eligibleForIncentive.test(emp1)) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not eligible");
		}
		
	}

}
