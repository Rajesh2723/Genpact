package ex05.inh_multilevel;

public class Rectangle extends Figure {

	Rectangle(double length, double height){
		// call parent class constructor - super
		super(length, height);
	}
	
	Rectangle(){
		System.out.println("Rectangle class default const");
	}
}
