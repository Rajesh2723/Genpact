
interface FourWheeler {
	int WHEELS = 4;
	double speed(double distance, double time);
	
	default public double mileage(double kms, 
			double litres){
		System.out.println("Interface default");
		return division(kms,litres);
	}
	
	static double calculateResaleValue(double origCost, double kms, 
	double years){
		System.out.println("Interface static");

		if(kms>50000 || years >10){
			return calculateCost(20, origCost);
		} else {
			return calculateCost(50, origCost);
		}
	}
	
	private double division(double num, double denom) {
		return num/denom;
	}

	private static double calculateCost(double pc, double origCost){
		return (pc * origCost)/100;
	}
}

class Car implements FourWheeler {
	
	double speed;
	
	@Override 
	public double speed(double distance, double time){
		speed = distance/time;
		return (speed);
	}
	
	@Override
	public double mileage(double kms, double litres){
		System.out.println("Truck default");
		return (kms/litres);
	}
	
	static double calculateResaleValue
	(double origCost, double kms, double years){
		System.out.println("Interface static");
		
		if(kms>50000 || years >10){
			return .2 * origCost;
		} else {
			return .5 * origCost;
		}
	}
	
	public String toString(){
		return "\n Total wheels : " + FourWheeler.WHEELS + ", speed = " + speed;
	}
}

class Jeep implements FourWheeler {
	double speed;
	
	@Override 
	public double speed(double distance, double time){
		speed = distance/time;
		return (speed);
	}
	
	public String toString(){
		return "\n Total wheels : " + FourWheeler.WHEELS + ", speed = " + speed;
	}
}

class InterfaceDemo {
	
	public static void main(String[] args){
		
		FourWheeler car = new Car();
		FourWheeler jeep = new Jeep();
		
		car.speed(100,2);
		jeep.speed(80,2);
		
		System.out.println(car);
		System.out.println(car.mileage(40, 2));
		System.out.println(FourWheeler.calculateResaleValue(500000, 5, 70000));
		
		System.out.println(jeep);
		System.out.println(jeep.mileage(50, 2));
		System.out.println(FourWheeler.calculateResaleValue(1200000, 5, 20000));
		
	}
}