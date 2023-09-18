package ex05.inh_multilevel;

public class Cuboid extends Rectangle {

	private double width;

	public Cuboid(double length, double height, double width) {
		super(length, height);
		this.width = width;
	}
	
	// Defining a method with the same signature in parent class
	// is known as Overriding
	// public method in parent should not have reduced visibility
	@Override
	public void display() {
		super.display();
		System.out.println("Width : " + width);
	}

}
