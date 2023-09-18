package ex02.class_object;

// Employee is a user-defined type
public class Employee {

	private int empId;
	private String name;
	private double basicSalary;

	// COMPANY_NAME - refactor the code
	final static String COMPANY_NAME = "ABC Pvt. Ltd.";

	// Signature -> Employee()
	public Employee() {
		empId = -1;
		name = "NA";
		basicSalary = -1;
	}

	// Signature -> Employee(int , String , double )

	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	// new Employee(101, "Yash", 35000);
	public Employee(int empId, String name, double basicSalary) {
		super();

		if (empId >= 101 && empId <= 200) {
			this.empId = empId;
		} else {
			System.out.println("Wrong id");
		}

		this.name = name;
		this.basicSalary = basicSalary;
	}

	// Signature -> Employee(String , double)
	public Employee(String name, double basicSalary) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	// setter method
	void setEmpId(int empId){
		this.empId = empId;
	}
	
	// getter method
	double getBasicSalary(){
		return basicSalary;
	}

	void display() {
		System.out.println("\n ----------------------");
		System.out.println("\n Emp Id : " + empId);
		System.out.println("\n Name : " + name);
		System.out.println("\n Salary : " + basicSalary);
	}
	// EmpId = 101, Name = Yash, Salary = 35000

	void display(String type) {
		System.out.println("\n ----------------------");
		System.out.println("EmpId = " + empId + ", Name = " + name + ", Salary = " + basicSalary);
	}

	double calculateTotalSalary(double deductionPc) {
		return (basicSalary - (basicSalary * deductionPc / 100));
	}

	double calculateTotalSalary(double deductionPc, double incentive) {
		return calculateTotalSalary(deductionPc) + incentive;
	}

}
