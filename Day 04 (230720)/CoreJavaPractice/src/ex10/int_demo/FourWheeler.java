package ex10.int_demo;

public interface FourWheeler {
	int WHEELS = 4;

	double speed(double distance, double time);

	default public double mileage(double kms, double litres) {
		System.out.println("Interface default");
		return division(kms, litres);
	}

	static double calculateResaleValue(double origCost, double kms, double years) {
		System.out.println("Interface static");

		if (kms > 50000 || years > 10) {
			return calculateCost(20, origCost);
		} else {
			return calculateCost(50, origCost);
		}
	}

	private double division(double num, double denom) {
		return num / denom;
	}

	private static double calculateCost(double pc, double origCost) {
		return (pc * origCost) / 100;
	}
}
