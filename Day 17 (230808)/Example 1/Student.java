package property.injection.primitive;

//1. POJO - Plain Old Java Object
//Plain Old => It is used to hold only data
//It does not have main

//2. Model

//3. Bean - 
//a. Getters and Setters, 
//b. Parameterized constructor, 
//c. non-parameterized constructor

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting Student Id");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address");
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
}