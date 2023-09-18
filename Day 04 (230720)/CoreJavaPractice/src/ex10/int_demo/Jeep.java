package ex10.int_demo;

public class Jeep implements FourWheeler {
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