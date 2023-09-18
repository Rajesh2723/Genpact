package ex03.aggregation;

// user-defined data type
public class Certificate {
	
	private String name;
	private double fees;

	public Certificate() {

	}

	public Certificate(String name, double fees) {
		super();
		this.name = name;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

}
