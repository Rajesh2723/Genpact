package ex07.rtp;

public class Rectangle extends Figure {

	Rectangle(double length, double height){
		// call parent class constructor - super
		super(length, height);
	}
	
	@Override
	public double area() {
		System.out.println("Rectangle's area");
		return getDimension1() * getDimension2();
	}
	
	void test() {
		System.out.println("Test");
	}
	
}
