package ex07.rtp;

public class Triangle extends Figure {

	public Triangle(double base, double height) {
		super(base, height);
	}

	// Ctrl + Space -> suggestions
	@Override
	public double area() {
		System.out.println("Triangle's area");
		return getDimension1()*getDimension2()/2;
	}
	
}
