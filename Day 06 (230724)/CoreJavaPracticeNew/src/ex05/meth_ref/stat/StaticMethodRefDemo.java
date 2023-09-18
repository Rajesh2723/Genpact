package ex05.meth_ref.stat;

@FunctionalInterface
interface Addable {
	int add(int num1, int num2);
}

class Example {
	static int addTwo(int n1, int n2) {
		return n1 + n2;
	}
}

public class StaticMethodRefDemo {

	public static void main(String[] args) {
		
		// Static method reference
		Addable addable1 = Example::addTwo;
		System.out.println(addable1.add(100, 200));

		Addable addable2 = Integer::sum;
		System.out.println(addable2.add(101, -101));
		
	}

}
