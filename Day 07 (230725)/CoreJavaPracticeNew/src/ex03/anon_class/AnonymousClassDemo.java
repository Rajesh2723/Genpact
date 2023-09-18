package ex03.anon_class;

@FunctionalInterface
interface Callable {
	void call();
}

public class AnonymousClassDemo {

	public static void main(String[] args) {

		Callable c = new Callable() {

			@Override
			public void call() {
				System.out.println("I am telephone class impl");

			}
		};

		c.call();

	}

}
