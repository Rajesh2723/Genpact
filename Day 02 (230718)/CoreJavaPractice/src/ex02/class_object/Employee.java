package ex02.class_object;

// Employee is a user-defined type
public class Employee {

	int empId;
	String name;
	double basicSalary;

	// Signature -> Employee()
	public Employee() {
		super();
	}

	// Signature -> Employee(int , String , double )
	public Employee(int empId, String name, double basicSalary) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	// Signature -> Employee(String , double)
	public Employee(String name, double basicSalary) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	// method
	// access-modifier access-specifier return-type name-of-method(params list) {
	//...
	//...
	//}
	
	void display() {
		System.out.println("\n ----------------------");
		System.out.println("\n Emp Id : " + empId);
		System.out.println("\n Name : " + name);
		System.out.println("\n Salary : " + basicSalary);
	}
	// EmpId = 101, Name = Yash, Salary = 35000
	
	void display(String type) {
		System.out.println("\n ----------------------");
		System.out.println
		("EmpId = " + empId + ", Name = " + name + ", Salary = " + basicSalary);
	}
	
	void display(int i) {
		
	}
	
	void display(int i, int j) {
		
	}
	
	
	
	
	

}
