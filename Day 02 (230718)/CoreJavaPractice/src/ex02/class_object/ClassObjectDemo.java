package ex02.class_object;

public class ClassObjectDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Yash", 35000);
		e1.display();
	
		Employee e2 = new Employee(102, "Raj", 55000);
		e2.display("");
		
		Employee e3 = new Employee();
		e3.display();
		
		Employee e4 = new Employee("Megha", 60000);
		e4.display("");

	}

}
