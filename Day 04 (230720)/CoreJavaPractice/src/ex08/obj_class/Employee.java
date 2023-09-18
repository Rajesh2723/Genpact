package ex08.obj_class;

public class Employee extends Object {
	private int empId;
	private String name;
	private double basicSalary;

	public Employee(int empId, String name, double basicSalary) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}

}
