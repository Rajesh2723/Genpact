package ex08.coll.lists;

import java.util.ArrayList;

public class EmployeeListDemo {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Abhishek", 30000, true));
		empList.add(new Employee("Hina", 35000, false));
		empList.add(new Employee("Gautam", 65000, true));
		empList.add(new Employee("Lekha", 55000, false));
		empList.add(new Employee("Ashutosh", 35000, false));
		System.out.println("1. " + empList);

		// change the name of employee no 3
		Employee e = empList.get(2);
		e.setName("Gautam Tiwari");
		System.out.println("2. " + empList);

		// change the name of employee no 4
		// Changing the state of object
		empList.get(3).setName("Lekha Joshi");
		System.out.println("3. " + empList);

		// modify the salaries of all employees
		// bonus is 30% of their salary

		// Using the traditional for loop
//		for(int i = 0 ; i < empList.size() ; i++) {
//			double currentSalary = empList.get(i).getSalary();
//			double newSalary = currentSalary * 1.3;
//			empList.get(i).setSalary(newSalary);
//		}

//		for(Employee emp : empList) {
//			double currentSalary = emp.getSalary();
//			double newSalary = currentSalary * 1.3;
//			emp.setSalary(newSalary);
//		}

		empList.forEach(employee -> {
			double currentSalary = employee.getSalary();
			double newSalary = currentSalary * 1.1;
			employee.setSalary(newSalary);
		});

		System.out.println("4. " + empList);
	}

}
