package ex04.inh_single;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(4, 5);
		rectangle.display();
		System.out.println("\n Area of rectangle = " + rectangle.area());
	}

}
