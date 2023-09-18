package ex02.class_object;

public class ClassObjectDemo {

	public static void main(String[] args) {

/*		Employee e1 = new Employee(-101, "Yash", 35000);
		e1.display();
		
		double deductionPc = 10;
		double totalSalary = e1.calculateTotalSalary(deductionPc);
		System.out.println("\n Total Salary = " + totalSalary);
		
		System.out.println("\n e1's company : " + Employee.COMPANY_NAME);
		
		// Employee.companyName = "XYZ PVT LTD.";
		// Employee e1 code ends here
		
		Employee e2 = new Employee(102, "Raj", 55000);
		e2.display("");
		
		deductionPc = 20;
		double incentive = 10000;
		totalSalary = e2.calculateTotalSalary(deductionPc, incentive);
		System.out.println("\n Total Salary = " + totalSalary);
		
		System.out.println("\n e2's company : " + Employee.COMPANY_NAME);
		// Employee e2 code ends here
		
		Employee e3 = new Employee();
		e3.display();
*/		
		Employee e4 = new Employee("Megha", 60000);
		e4.display("");
		e4.setEmpId(105);
		//e4.display("");
		
		System.out.println("\n Salary of Megha : " + e4.getBasicSalary());
		

	}

}
