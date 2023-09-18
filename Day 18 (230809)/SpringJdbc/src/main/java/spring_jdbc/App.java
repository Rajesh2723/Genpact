package spring_jdbc;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_jdbc.dao.BookDao;
import spring_jdbc.entity.Book;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("config.xml");
		
		BookDao bookDao = (BookDao)ctx.getBean("bookDao");
		
		// Inserting a book
//		Book book = new Book("Maths", 500, 4, true, LocalDate.of(2008, 11, 7));
//		
//		int result = bookDao.insertBook(book);
//		
//		if(result == 1) {
//			System.out.println("Book added successfully");
//		} else {
//			System.out.println("Book can't be added");
//		}
		
		// Updating the book
//		Book bookToUpdate = 
//				new Book(1, "Let Us C", 250, 5, true, LocalDate.of(2023, 8, 9));
//		
//		int updateResult = bookDao.updateBook(bookToUpdate);
//		
//		if(updateResult == 1) {
//			System.out.println("Book updated successfully");
//		} else {
//			System.out.println("Book can't be updated");
//		}
				
		// delete
//		int bookIdToDelete = 2;
//		
//		int deleteResult = bookDao.deleteBook(bookIdToDelete);
//		
//		if(deleteResult == 1) {
//			System.out.println("Book deleted successfully");
//		} else {
//			System.out.println("Book can't be deleted");
//		}
		
		// Get 1 book
		int bookToFetch = 4;
		Book fetchedBook = bookDao.getBook(bookToFetch);
		System.out.println(fetchedBook);
		
		System.out.println("---------------------------");
		
		// Get all books
		List<Book> books = bookDao.getAllBooks();
		System.out.println(books);
		
		
		
		
		
		
		
		
	}
}
