package ex03.serl_desrl;

import java.io.Serializable;

// A class MUST implement Serializable interface so that
// it could be serialized.
public class Employee implements Serializable {
	
	private String name;
	private double salary;
	private boolean isPresent;

	public Employee(String name, double salary, 
			boolean isPresent) {
		this.name = name;
		this.salary = salary;
		this.isPresent = isPresent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	@Override
	public String toString() {
		return "\n Employee [name=" + name + ", salary=" + salary + ", isPresent=" + isPresent + "]";
	}

}
