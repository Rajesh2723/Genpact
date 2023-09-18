package ex11.parallel_sort;

import java.util.Arrays;

public class ParallelSortDemo {

	public static void main(String[] args) {
		// Ex 1
		double[] numbers = {9, 1, 5, 3, 4, 7};
		System.out.println("1. " + Arrays.toString(numbers));
		Arrays.parallelSort(numbers);
		
		System.out.println("2. " + Arrays.toString(numbers));
		
		// Ex 2
		Movie[] movies = new Movie[3];
		movies[0] = new Movie(4, 300);
		movies[1] = new Movie(3, 400);
		movies[2] = new Movie(5, 600);
		System.out.println("3. " + Arrays.toString(movies));
		
		Arrays.parallelSort(movies, (m1, m2) -> m1.getRating() - m2.getRating());
		
		System.out.println("4. " + Arrays.toString(movies));
	
	}

}
