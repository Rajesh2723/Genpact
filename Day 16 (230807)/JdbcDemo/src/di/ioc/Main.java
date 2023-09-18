package di.ioc;

public class Main {

	public static void main(String[] args) {
		B b = new B(1,2);
		
		//b has to be supplied to A
		// dependency has to be injected to dependent module-DI
		
		// Spring will inject the dependency at runtime
		// The control of DI has shifted to Spring
		// The control of DI has inverted to Spring
		// Inversion of Control (IoC)
		A a = new A(b);
	}
}
