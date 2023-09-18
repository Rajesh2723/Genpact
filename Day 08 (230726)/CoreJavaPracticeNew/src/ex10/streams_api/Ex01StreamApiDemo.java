package ex10.streams_api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// static import
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex01StreamApiDemo {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(3, "Sony", "TV", 55000, false));
		products.add(new Product(7, "LG", "TV", 40000, true));
		products.add(new Product(4, "Mi", "watch", 8000, false));
		products.add(new Product(2, "LG", "Microwave", 12000, false));
		products.add(new Product(8, "Mi", "Tablet", 15000, true));
		products.add(new Product(1, "Mi", "TV", 25000, false));
		products.add(new Product(6, "Sony", "Watch", 15000, true));
		System.out.println("1. " + products);
		
		Stream<Product> productsStream =  products.stream();
		
		// Get the prices of all TVS
		List<Product> listOfTVs = productsStream
				.filter(p -> p.getProduct().equals("TV"))
				.collect(toList());
		
		System.out.println("2. " + listOfTVs);
		System.out.println("3. " + products);
		
		// The List of Prices of Watches
		List<Double> priceOfWatches = products
				                        .stream()
				                        .filter(p->p.getProduct().equalsIgnoreCase("watch"))
				                        .map(p->p.getPrice())
				                        .collect(toList());
		
		System.out.println("4. " + priceOfWatches);
		
		// Get the list of all products that are in stock
		List<Product> inStock = products.stream()
									.filter(p->p.isAvailability())
									.collect(toList());
		System.out.println("5. " + inStock);
		
		// Get the List of all products that are not in stock
		// To get specific class of any type
		LinkedList<Product> notInStock = products.stream()
				.filter(p-> !p.isAvailability())
				.collect(Collectors.toCollection(LinkedList::new));

		System.out.println("6. " + notInStock);
		
		// Get the set of all brand names that are not available
		Set<String> brandsNotInStock = products.stream()
										.filter(p-> !p.isAvailability())
										.map(p->p.getBrand())
										.collect(toSet());
		System.out.println("7. " + brandsNotInStock);

		
		// for each
		// Apply 10% discount on all the TVs
		
		products.stream()
		.filter(item -> item.getProduct().equalsIgnoreCase("TV"))
		.forEach(item -> {
			double currentPrice = item.getPrice();
			double newPrice = currentPrice * 0.9;
			item.setPrice(newPrice);
		});
		
		System.out.println("8. " + products);
		
		
		
		
		
		
		
		
		
	}

}
