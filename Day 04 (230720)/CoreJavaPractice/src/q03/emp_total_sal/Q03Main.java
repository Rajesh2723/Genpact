package q03.emp_total_sal;

public class Q03Main {

	public static void main(String[] args) {
		Employee e1 = new Employee(10000);
		System.out.println("\n Total Salary = " + Employee.totalSalary);
		e1.display();

		Employee e2 = new Employee(25000);
		System.out.println("\n Total Salary = " + Employee.totalSalary);
		e2.display();

		Employee e3 = new Employee(55000);
		System.out.println("\n Total Salary = " + Employee.totalSalary);
		e3.display();
		
		System.out.println("\n Total Employees = " + Employee.totalEmployees);
		
//		static double averageSalary() {
//			return totalSalary/totalEmployees;
//		}
		
		System.out.println("\n Average salary = " + Employee.averageSalary());
	}

}
