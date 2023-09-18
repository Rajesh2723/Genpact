package sb.web.app.repo;

import java.util.List;

import sb.web.app.entities.Book;

public interface BookDao {
	
	int insertBook(Book book);
	
	int updateBook(Book book);
	
	int deleteBook(int bookId);
	
	Book getBook(int bookId);
	
	List<Book> getListOfBooks();
	
}