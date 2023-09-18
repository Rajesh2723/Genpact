package ex10.int_demo;

public class InterfaceDemo {

	public static void main(String[] args) {
		FourWheeler car = new Car();
		FourWheeler jeep = new Jeep();

		car.speed(100, 2);
		jeep.speed(80, 2);

		System.out.println(car);
		System.out.println(car.mileage(40, 2));
		System.out.println(FourWheeler.calculateResaleValue(500000, 5, 70000));

		System.out.println(jeep);
		System.out.println(jeep.mileage(50, 2));
		System.out.println(FourWheeler.calculateResaleValue(1200000, 5, 20000));

	}

}
