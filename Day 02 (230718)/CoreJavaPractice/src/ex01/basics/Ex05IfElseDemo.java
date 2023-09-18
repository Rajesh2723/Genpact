package ex01.basics;

public class Ex05IfElseDemo {

	public static void main(String[] args) {
		double basicSalary, incentive, grossSalary;
		
		basicSalary = 10000;
		
		// only an expression that evaluates to either true/false
		// is allowed in if-else
		if(basicSalary <= 10000) {
			// BODMAS
			incentive = (basicSalary * 80)/100;
		} else {
			incentive = (basicSalary * 50)/100;
		}
		
		grossSalary = basicSalary + incentive;
		
		System.out.println("\n Gross Salary = " + grossSalary);
		
		

	}

}
