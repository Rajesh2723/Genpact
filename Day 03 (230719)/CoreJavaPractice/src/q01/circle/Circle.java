package q01.circle;

public class Circle {
	double radius;
	double area;

	void init(double r) {
		radius = r;
	}

	void calc() {
		area = Math.PI * Math.pow(radius, 2);
	}

	void display() {
		System.out.println("\n Radius : " + radius);
		System.out.println("\n Area : " + area);
	}
}
