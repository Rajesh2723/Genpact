package genpact.mvc.jdbc.entities;

import java.util.List;

public class Book {
	private String title;
	private String author;
	private int year;
	private boolean available;
	private List<String> genres;
	private String selectedGenre;
	private List<String> authors;

	public Book() {
		super();
	}

	public Book(String title, String author, int year, boolean available, List<String> genres, String selectedGenre,
			List<String> authors) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.available = available;
		this.genres = genres;
		this.selectedGenre = selectedGenre;
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public String getSelectedGenre() {
		return selectedGenre;
	}

	public void setSelectedGenre(String selectedGenre) {
		this.selectedGenre = selectedGenre;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", available=" + available
				+ ", genres=" + genres + ", selectedGenre=" + selectedGenre + ", authors=" + authors + "]";
	}

}
