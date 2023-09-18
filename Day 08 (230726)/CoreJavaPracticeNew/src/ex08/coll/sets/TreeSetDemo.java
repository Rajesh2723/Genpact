package ex08.coll.sets;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
//		TreeSet<Integer> empIds = new TreeSet<Integer>();
//
//		empIds.add(101);
//		empIds.add(103);
//		empIds.add(107);
//		empIds.add(109);
//		empIds.add(103);
//		empIds.add(102);
//		empIds.add(105);
//
//		System.out.println("1. " + empIds);
		System.out.println("---------------------");

		// sorted acc to names
		TreeSet<Employee> empSet = new TreeSet<Employee>();
		empSet.add(new Employee("Abhishek", 30000, true));
		empSet.add(new Employee("Hina", 35000, false));
		empSet.add(new Employee("Gautam", 65000, true));
		empSet.add(new Employee("Lekha", 55000, false));
		empSet.add(new Employee("Ashutosh", 38000, false));
		System.out.println("1. " + empSet);

		// sorting according to salaries
		// Comparator interface // (def)
		TreeSet<Employee> empSet2 = new TreeSet<Employee>((e1, e2) -> {
			Double salary1 = e1.getSalary();
			Double salary2 = e2.getSalary();
			return salary1.compareTo(salary2);
		});
		empSet2.add(new Employee("Abhishek", 30000, true));
		empSet2.add(new Employee("Hina", 35000, false));
		empSet2.add(new Employee("Gautam", 65000, true));
		empSet2.add(new Employee("Lekha", 55000, false));
		empSet2.add(new Employee("Ashutosh", 38000, false));
		System.out.println("2. " + empSet2);

	}

}
