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
		int result = 0;
		
		// Inserting a book
//		Book book = new Book("Let Us Cpp", 300, 10, true, LocalDate.of(2023, 8, 10));
//		
//		result = bookDao.insertBook(book);
//		
//		if(result == 1) {
//			System.out.println("Book added successfully");
//		} else {
//			System.out.println("Book can't be added");
//		}
		
//		System.out.println("---------------------------");
		
		// Updating the book
//		Book bookToUpdate = 
//				new Book(7, "Let Us C++", 350, 0, false, LocalDate.of(2020, 5, 5));
//		
//		result = bookDao.updateBook(bookToUpdate);
//		
//		if(result == 1) {
//			System.out.println("Book updated successfully");
//		} else {
//			System.out.println("Book can't be updated");
//		}

//		System.out.println("---------------------------");
	
		// Delete a book
//		int bookIdToDelete = 6;
//		
//		result = bookDao.deleteBook(bookIdToDelete);
//		
//		if(result == 1) {
//			System.out.println("Book deleted successfully");
//		} else {
//			System.out.println("Book can't be deleted");
//		}
		
//		System.out.println("---------------------------");
		
		// Get 1 book
//		int bookToFetch = 1;
//		Book fetchedBook = bookDao.getBook(bookToFetch);
//		System.out.println(fetchedBook);
		
//		System.out.println("---------------------------");
		
		// Get all books
		List<Book> books = bookDao.getAllBooks();
		System.out.println(books);
	
	}
}
