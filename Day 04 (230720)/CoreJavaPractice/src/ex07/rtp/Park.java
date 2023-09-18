package ex07.rtp;

public class Park {
	
	public void calculateGrassCost(Figure f, double price) {
		double totalCost = f.area() * price; // runtime polymorphism
		System.out.println("\n Total cost : " + totalCost);
	}
}
