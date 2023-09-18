package ex05.meth_ref.inst;

@FunctionalInterface
interface Callable {
	void call();
}

class Example {
	void greet() {
		System.out.println("Hey there, how are you?");
	}
}

public class InstanceMethodRefDemo {

	public static void main(String[] args) {
		
		// Syntax 1
		Example example1 = new Example();
		Callable c1 = () -> example1.greet();
		c1.call();
		
		// Syntax 2 - Instance method reference
		Example example2 = new Example();
		Callable c2 = example2::greet;
		c2.call();

	}

}
