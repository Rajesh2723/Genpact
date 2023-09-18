package ex08.coll.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<String> names = new ArrayDeque<String>();
		
		// methods working with 1st and last elements
		names.offerFirst("Zeeshan");
		names.offerLast("Harish");
		names.offerFirst("Gourav");
		
		System.out.println(names);
		names.addFirst("Jayta");
		System.out.println("1. " + names);
		
		String firstElement = names.peekFirst();
		System.out.println("2. " + firstElement);
		System.out.println("3. " + names);
		
		String lastRemovedElement = names.pollLast();
		System.out.println("4. " + lastRemovedElement);
		System.out.println("5. " + names);

		// all other ops-> add, remove, removeIf, contains, size, clear

	}

}
