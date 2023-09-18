package ex01.str_joiner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// Example1
		StringJoiner joiner = new StringJoiner(", ", "{", "}");
		
		joiner.add("Indore");
		joiner.add("Bhopal");
		joiner.add("Jabalpur");
		joiner.add("Gwalior");
		joiner.add("Ujjain");
		
		System.out.println("1. " + joiner);

		// Example 2 - Array
		
		String[] fruits = {"Apples", "Bananas", "Oranges", "Grapes"};
		StringJoiner joiner2 = new StringJoiner("-","[","]");
		
		for(String f : fruits) {
			joiner2.add(f);
		}
		
		// Convert StringJoiner into String
		String result = joiner2.toString();
		
		System.out.println("2. " + result);
		
		// Example 3 - Collection
		
		List<String> names = List.of("Tarun" , "Bharat", "Aadesh", "Kabir");
		
		StringJoiner joiner3 = new StringJoiner(" & ", "!! ", " !!");
		
		joiner3.add(names.get(0)).add(names.get(1)).add(names.get(2)).add(names.get(3));
		
		// Print the resulting String in upper case
		System.out.println(joiner3.toString().toUpperCase());
		
		
		
		
		
		
		
		
	}

}
