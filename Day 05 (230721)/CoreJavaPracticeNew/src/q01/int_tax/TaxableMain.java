package q01.int_tax;

interface Taxable {
	// salesTax=7% and incomeTax=10.5%.

	double SALES_TAX = 7;
	double INCOME_TAX = 10.5;

	void calcTax();
}

class Employee implements Taxable {

	// empId,name,salary
	private int empId;
	private String name;
	private double salary;

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void calcTax() {

		double yearlySalary = salary * 12;
		double tax = yearlySalary * INCOME_TAX/100;

		System.out.println("\n Employees Tax = " + tax);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class TaxableMain {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Harsh", 60000);
		emp.calcTax();
	}
}