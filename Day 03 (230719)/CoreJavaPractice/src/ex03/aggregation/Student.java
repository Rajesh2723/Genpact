package ex03.aggregation;

public class Student {
	private String name;
	private Certificate certificate;

	public Student() {}

	public Student(String name, Certificate certificate) {
		this.name = name;
		this.certificate = certificate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

}
