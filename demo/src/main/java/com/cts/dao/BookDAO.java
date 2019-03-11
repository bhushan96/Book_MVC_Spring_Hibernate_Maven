package com.cts.dao;

import java.util.List;

import com.cts.entity.Book;

public interface BookDAO {

	void saveBook(Book book);
	List<Book> listBooks();
	Book getBook(int id);
	void deleteBook(int id);
	}
