package ex09.abs_class;

public class Triangle extends Figure {

	public Triangle(double base, double height) {
		super(base, height);
	}

	@Override
	public double area() {
		System.out.println("Triangle's area");
		return getDimension1() * getDimension2() / 2;
	}

}
