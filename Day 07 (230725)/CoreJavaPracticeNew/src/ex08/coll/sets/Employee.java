package ex08.coll.sets;

public class Employee implements Comparable<Employee> {
	
	@Override
	public int compareTo(Employee e1) {
		Double salary1 = this.salary;
		Double salary2 = e1.salary;
		// Ascending order acc to salaries
		//return salary1.compareTo(salary2);
		
		// Descending order acc to salaries
		//return salary2.compareTo(salary1);
		
		// Ascending order acc to name
		//return this.name.compareTo(e1.name);
		
		// Descending order acc to name
		return e1.name.compareTo(this.name);
		
	}
	
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
