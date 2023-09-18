package sb.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sb.web.app.entities.Book;
import sb.web.app.repo.BookDao;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> getListOfBooks() {
		return bookDao.getListOfBooks();
	}

	@Override
	public Book getBook(int bookId) {
		return bookDao.getBook(bookId);
	}

	@Override
	public int insertBook(Book book) {
		return bookDao.insertBook(book);
	}

	@Override
	public int deleteBook(int bookId) {
		return bookDao.deleteBook(bookId);
	}

	@Override
	public int updateBook(Book book) {
		return bookDao.updateBook(book);
	}
}