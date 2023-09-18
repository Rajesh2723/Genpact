package ex08.coll.queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> names = new PriorityQueue<String>();

		names.offer("Abhishek");
		names.offer("Ashutosh");
		names.offer("Sapna");
		names.offer("Megha");
		names.offer("Raj");

		System.out.println("1. " + names);

		// retrieves the head
		String head = names.peek();
		System.out.println(head);
		System.out.println("2. " + names);

		// retrieves and removes the head
		String removedHead = names.poll();
		System.out.println(removedHead);
		System.out.println("3. " + names);

		// all other ops-> add, remove, removeIf, contains, size, clear

	}

}
