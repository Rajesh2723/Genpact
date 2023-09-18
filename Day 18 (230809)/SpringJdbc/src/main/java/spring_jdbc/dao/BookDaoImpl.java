package spring_jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import spring_jdbc.entity.Book;

public class BookDaoImpl implements BookDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertBook(Book book) {
		String insertQuery = "INSERT INTO books "
				+ "(bookName, bookPrice, noOfCopies, "
				+ "inStock, dateOfPublication) "
				+ "VALUES (?,?,?,?,?)";
		
		return jdbcTemplate.update(insertQuery, 
				book.getBookName(), book.getBookPrice(), 
				book.getNoOfCopies(), book.isInStock(), 
				book.getDateOfPublication());
	}

	@Override
	public int updateBook(Book book) {
		String updateQuery = "UPDATE books "
				+ "SET bookName = ?, bookPrice = ?, noOfCopies = ?, "
				+ "inStock = ?, dateOfPublication = ? WHERE bookId = ?";

		return jdbcTemplate.update(updateQuery, book.getBookName(), 
				book.getBookPrice(), book.getNoOfCopies(), book.isInStock(), 
				book.getDateOfPublication(), book.getBookId());
	}

	@Override
	public int deleteBook(int bookId) {
		String deleteQuery = "DELETE FROM books WHERE bookId = ?";
		return jdbcTemplate.update(deleteQuery, bookId);
	}

	@Override
	public Book getBook(int bookId) {
		
		String getBookQuery = "SELECT * FROM books WHERE bookId = ?";
		
		return jdbcTemplate
				.queryForObject(getBookQuery, 
						new RowMapperImpl(), bookId);
	
	}

	@Override
	public List<Book> getAllBooks() {
		String getAllBooksQuery = "SELECT * FROM books";
		return jdbcTemplate.query(getAllBooksQuery, new RowMapperImpl());
	}

}
