package ex02.optional_class;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		// Use case
		String str1 = "Universe";

		if (str1 != null) {
			System.out.println("1. Length of string = " + str1.length());
		} else {
			System.out.println("1. Data not found");
		}

		// Example 1
		String str2 = "Initial Text";
		Optional<String> container2 = Optional.ofNullable(str2);

		if (container2.isPresent()) {
			System.out.println("2. " + container2.get());
		} else {
			System.out.println("2. No data present");
		}

		// Example 2
		System.out.println("3. " + container2.orElse("Alternate text").toUpperCase());

		System.out.println("4. " + container2.orElseThrow().length());

	}

}
