package ex09.abs_class;

public class Rectangle extends Figure {

	Rectangle(double length, double height) {
		super(length, height);
	}

	@Override
	public double area() {
		System.out.println("Rectangle's area");
		return getDimension1() * getDimension2();
	}

}
