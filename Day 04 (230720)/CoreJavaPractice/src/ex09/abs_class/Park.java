package ex09.abs_class;

public class Park {
	
	public void calculateGrassCost(Figure f, double price) {
		double totalCost = f.area()  * price; 
		System.out.println("\n Total cost : " + totalCost);
	}
}
