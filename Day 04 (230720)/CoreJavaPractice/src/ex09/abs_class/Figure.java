package ex09.abs_class;

public abstract class Figure {
	private double dimension1;
	private double dimension2;

	public Figure() {
		super();
	}

	public Figure(double dimension1, double dimension2) {
		super();
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}

	public double getDimension1() {
		return dimension1;
	}

	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}

	public double getDimension2() {
		return dimension2;
	}

	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}

	public abstract double area();

	public void display() {
		System.out.println("Dim1 : " + dimension1 + ", Dim2 : " + dimension2);
	}
}