package ex05.inh_multilevel;

public class Cuboid extends Rectangle {

	private double width;

	public Cuboid(double length, double height, double width) {
		super(length, height);
		this.width = width;
	}

	public Cuboid() {
		System.out.println("Cuboid class default const");
	}

//	public void show() {
//		System.out.print("Length : " + getDimension1());
//		System.out.print(", Height : " + getDimension2());
//		System.out.println(", Width : " + width);
//	}

	@Override
	public void display() {
		super.display();
		System.out.println("Width : " + width);
	}

	@Override
	public double area() {
		return super.area() * width;
	}

}
