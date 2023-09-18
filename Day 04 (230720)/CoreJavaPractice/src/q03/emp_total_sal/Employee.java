package q03.emp_total_sal;

public class Employee {
	private int empNo;
	private double salary;
	static double totalSalary;
	static int totalEmployees;
	
	public Employee(double salary) {
		this.empNo = ++totalEmployees;
		this.salary = salary;
		totalSalary += this.salary;
	}
	
	void display(){
		System.out.println("\n Emp No : " + empNo);
		System.out.println("\n Salary : " + salary);
		System.out.println("\n totalSalary : " + totalSalary);
	}
	
	static double averageSalary() {
		return totalSalary/totalEmployees;
	}	
	

}
