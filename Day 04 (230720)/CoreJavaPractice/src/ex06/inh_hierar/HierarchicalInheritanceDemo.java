package ex06.inh_hierar;

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(4, 5);
		rectangle.display();
		System.out.println("\n Area of rectangle = " + rectangle.area());
		
		Triangle triangle = new Triangle(4, 10);
		triangle.display();
		System.out.println("\n Area of Triangle = " + triangle.area());
	}

}
