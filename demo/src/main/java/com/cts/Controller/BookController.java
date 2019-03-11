package com.cts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.entity.Book;
import com.cts.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
@Autowired
BookService bookService;

@GetMapping("/list")
public String listAllBooks(Model model){
	List<Book> lb=bookService.list();
	model.addAttribute("books",lb);
	return "booklist";
}

@GetMapping("/showForm")
public String showFormForAdd(Model model){
	Book theBook=new Book();
	model.addAttribute("book",theBook);
	return "addbook";
}

@PostMapping("/saveBook")
public String saveABook(@ModelAttribute("book") Book theBook){
	bookService.saveBook(theBook);

	return "redirect:/book/list";
}

@GetMapping("/updateForm")
public String showFormForUpdate(@RequestParam("bookId") int theId,Model model){
	Book theBook=bookService.getBook(theId);	
	model.addAttribute("book",theBook);
	return "addbook";
}
@GetMapping("/deleteBook")
public String deleteABook(@RequestParam("bookId") int theId,Model model){
	bookService.deleteBook(theId);
	return "redirect:/book/list";
}


}
