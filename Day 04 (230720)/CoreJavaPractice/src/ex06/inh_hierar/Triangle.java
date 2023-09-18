package ex06.inh_hierar;

public class Triangle extends Figure {

	public Triangle(double base, double height) {
		super(base, height);
	}

	// Ctrl + Space -> suggestions
	@Override
	public double area() {
		return super.area()/2;
	}
	
}
