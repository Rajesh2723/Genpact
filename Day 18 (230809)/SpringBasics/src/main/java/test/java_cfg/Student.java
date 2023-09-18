package test.java_cfg;

public class Student {
	private String name;
	private String subject;
	private Book book;

	public Student() {
		super();
	}

	public Student(String name, String subject , Book book) {
		super();
		this.name = name;
		this.subject = subject;
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", book=" + book + "]";
	}

}
