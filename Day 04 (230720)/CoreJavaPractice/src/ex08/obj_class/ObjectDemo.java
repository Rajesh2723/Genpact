package ex08.obj_class;

public class ObjectDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Yash", 10000);
		System.out.println(emp.toString());

		emp = null;

	}

}
