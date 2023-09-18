package ex07.rtp;

public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		Park p = new Park();
		
		Figure figure = new Figure(1, 2);
		p.calculateGrassCost(figure, 50);
		
		figure = new Rectangle(20, 8); // upcasting
		p.calculateGrassCost(figure, 200);
		
//		figure.test();
		
		figure = new Triangle(10, 6); // upcasting
		p.calculateGrassCost(figure, 200);
		
	}

}
