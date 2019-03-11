package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.BookDAO;
import com.cts.entity.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {

	
	@Autowired
	private BookDAO bookDAO;
	
	@Override
	public void saveBook(Book book) {
		bookDAO.saveBook(book);

	}

	@Override
	@org.springframework.transaction.annotation.Transactional
	public List<Book> list() {
	return bookDAO.listBooks();
		
	}

	@Override
	public Book getBook(int id) {
		
		Book book=bookDAO.getBook(id);
		return book;
	}

	@Override
	public void deleteBook(int id) {
			bookDAO.deleteBook(id);
		
	}


}
