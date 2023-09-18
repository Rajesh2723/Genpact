package ex09.abs_class;

public class AbstractClassDemo {
	
	public static void main(String[] args) {
		Park p = new Park();
		p.calculateGrassCost(new Rectangle(20, 8), 200);
		p.calculateGrassCost(new Triangle(10, 6), 200);		
	}

}
