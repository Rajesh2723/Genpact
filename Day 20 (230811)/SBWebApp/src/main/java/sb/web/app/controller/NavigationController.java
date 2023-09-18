package sb.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sb.web.app.entities.Book;
import sb.web.app.services.BookService;

@Controller
public class NavigationController {

	@Autowired
	BookService bookService;
	
	@RequestMapping(value = { "/", "/openBookDashBoardPage" })
	public String openBookDashBoardPage(Model model) {

		// Step 1: We have to get the list of books from the database
		List<Book> listOfBooks = bookService.getListOfBooks();

		// Step 2: We have to pass the books List to book_dashboard.jsp
		model.addAttribute("listOfBooks", listOfBooks);

		return "book_dashboard";
	}

	@RequestMapping("/openAddBookPage")
	public String openAddBookPage() {
		return "book_add";
	}

	@RequestMapping("/openUpdateBookPage/{bookId}")
	public String openUpdateBookPage(@PathVariable("bookId") int bookId, Model model) {
		System.out.println("\n Book id: " + bookId);
		Book bookToUpdate = bookService.getBook(bookId);
		System.out.println("Book To update: " + bookToUpdate);
		model.addAttribute("bookToUpdate", bookToUpdate);

		return "book_update";
	}

}