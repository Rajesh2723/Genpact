package sb.web.app.services;

import java.util.List;

import sb.web.app.entities.Book;

public interface BookService {

	List<Book> getListOfBooks();
	Book getBook(int bookId);
	int insertBook(Book book);
	int deleteBook(int bookId);
	int updateBook(Book book);
}
