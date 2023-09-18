package ex01.basics;

public class Q01CircleMeasurement {

	public static void main(String[] args) {
		
		double radius, area, circumference;

		radius = 5;

		area = Math.PI * Math.pow(radius, 2);
		circumference = 2 * Math.PI * radius;

		System.out.println("\n Area = " + area);
		System.out.println("\n Cicumference = " + circumference);

	}

}
