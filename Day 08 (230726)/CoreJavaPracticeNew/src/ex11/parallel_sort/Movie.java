package ex11.parallel_sort;

public class Movie {
	private int rating;
	private double collection;

	public Movie(int rating, double collection) {
		super();
		this.rating = rating;
		this.collection = collection;
	}

	public int getRating() {
		return rating;
	}

	public double getCollection() {
		return collection;
	}

	@Override
	public String toString() {
		return "\n Movie [rating=" + rating + ", collection=" + collection + "]";
	}

}
