package auto.wiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {	
	
	// Case 1. Auto-wiring the property
	@Autowired
	private Address empAddress;

//	Use @Qualifier with @AutoWired when multiple beans of same type are declared in configuration file
//	@Autowired
//	@Qualifier("empAddress2")
//	private Address empAddress;

	public Employee() {
		System.out.println("Employee class default constructor");
	}

	// Case 2. Auto-wiring the constructor
//	@Autowired
	public Employee(Address empAddress) {
		System.out.println("Employee class parameterized constructor");
		this.empAddress = empAddress;
	}
	
	// Case 3. Auto-wiring the Setter
//	@Autowired
	public void setEmpAddress(Address empAddress) {
		System.out.println("Employee class setEmpAddress");
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empAddress=" + empAddress + "]";
	}
}