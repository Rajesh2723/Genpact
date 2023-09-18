package ex04.lambda_exp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Callable {
	void call();
}

@FunctionalInterface
interface Addable {
	int add(int num1, int num2);
}

@FunctionalInterface
interface Increment {
	int incrementByOne(int number);
}

public class LambdaExpressionsDemo {

	public static void main(String[] args) {

		// inference - anonymous class Telephone defining call()
		Callable c = () -> {
			System.out.println("Calling in shortest way possible. Wow");
		};
		c.call();
		
		// () -> {}
		
		// Syntax 1
//		Addable addable = (int num1, int num2) -> {
//			return num1 + num2;
//		}; 

		// Syntax 2
//		Addable addable = (num1, num2) -> {
//			return num1 + num2;
//		};

		// Syntax 3 - if there is only 1 stmt that is return stmt
		Addable addable = (num1, num2) -> num1 + num2;
		System.out.println(addable.add(100, 200));

		// if there is only 1 parameter, we can remove ()
		Increment i = a -> ++a;
		System.out.println(i.incrementByOne(10));
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Lg TV");
		names.add("Apple Watch");
		names.add("Mi Watch");
		names.add("Oppo Mobile");
		names.add("Sony TV");
		System.out.println(names);
		
		// filter out TVs
		List<String> tvs = names.stream().filter(n -> !n.contains("TV")).collect(Collectors.toList());
		
		System.out.println(tvs);

	}
}
