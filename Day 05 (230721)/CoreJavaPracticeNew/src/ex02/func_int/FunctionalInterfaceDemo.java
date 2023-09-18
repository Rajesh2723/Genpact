package ex02.func_int;

@FunctionalInterface
interface Callable {
	void call();
}

class Telephone implements Callable {
	@Override
	public void call() {
		System.out.println("Calling someone");
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Callable c = new Telephone();
		c.call();
	}

}
