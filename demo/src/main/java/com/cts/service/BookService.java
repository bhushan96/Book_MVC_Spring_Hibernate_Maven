package com.cts.service;

import java.util.List;

import com.cts.entity.Book;

public interface BookService {
	void saveBook(Book book);
	List<Book> list();
	Book getBook(int id);
	void deleteBook(int id);

}
