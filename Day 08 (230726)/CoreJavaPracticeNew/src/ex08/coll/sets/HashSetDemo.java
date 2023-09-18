package ex08.coll.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> empIds = new HashSet<Integer>();
		
		empIds.add(101);
		empIds.add(103);
		empIds.add(107);
		empIds.add(109);
		empIds.add(103);
		empIds.add(102);
		empIds.add(105);
		
		System.out.println("1. " + empIds);
		empIds.add(null);
		System.out.println("2. " + empIds);
		empIds.add(null);
		System.out.println("3. " + empIds);
		
		System.out.println("----------------------------------");
		
		LinkedHashSet<Integer> empIds2 = new LinkedHashSet<Integer>();
		
		empIds2.add(101);
		empIds2.add(103);
		empIds2.add(107);
		empIds2.add(109);
		empIds2.add(103);
		empIds2.add(102);
		empIds2.add(105);
		
		System.out.println("4. " + empIds2);
		empIds.add(null);
		System.out.println("5. " + empIds2);
		empIds.add(null);
		System.out.println("6. " + empIds2);
		
	}

}
