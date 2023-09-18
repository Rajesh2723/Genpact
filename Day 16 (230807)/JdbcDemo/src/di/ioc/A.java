package di.ioc;

// A is dependent on B for its work
// B is the dependency
// A is the dependent class
public class A {
	// Best practice is: not to instantiate 
	// one class inside another class
	
	// we should pass the reference
	public A(B b) {
		b.doWork();
	}
}
