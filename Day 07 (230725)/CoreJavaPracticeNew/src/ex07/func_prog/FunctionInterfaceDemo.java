package ex07.func_prog;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		// I want to pass "indore" (String) and get "INDORE" (String)
		
		// Parent interface      ref = definition of String apply(String name)
		Function<String, String> up = name -> name.toUpperCase();
		System.out.println(up.apply("indore"));

		// I want to pass String and get its length
		Function<String, Integer> length = str -> str.length();
		System.out.println(length.apply("Its a beautiful day"));
		
		// I want to pass an Employee and get its salary (Double)
		Function<Employee, Double> totalSalary = 
				e -> e.getBs() - e.getDed() + e.getAdd();
	
		Employee emp = new Employee(10000, 500, 1000);
		
		System.out.println(totalSalary.apply(emp));
		
	
	}

}
