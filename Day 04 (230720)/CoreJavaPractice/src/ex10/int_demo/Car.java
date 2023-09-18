package ex10.int_demo;

public class Car implements FourWheeler {

	double speed;

	@Override
	public double speed(double distance, double time) {
		speed = distance / time;
		return (speed);
	}

	@Override
	public double mileage(double kms, double litres) {
		System.out.println("Truck default");
		return (kms / litres);
	}

	static double calculateResaleValue(double origCost, double kms, double years) {
		System.out.println("Interface static");

		if (kms > 50000 || years > 10) {
			return .2 * origCost;
		} else {
			return .5 * origCost;
		}
	}

	public String toString() {
		return "\n Total wheels : " + FourWheeler.WHEELS + ", speed = " + speed;
	}
}