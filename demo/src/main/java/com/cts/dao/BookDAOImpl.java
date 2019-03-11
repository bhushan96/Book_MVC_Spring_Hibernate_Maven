package com.cts.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.entity.Book;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public void saveBook(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
		System.out.println("Data Saved");

	}

	@Override
	public List<Book> listBooks() {
		Session session=sessionFactory.getCurrentSession();
		Query qry=session.createQuery("from Book b");
		List<Book> l=qry.getResultList();
		return l;
		
	}

	@Override
	@Transactional
	public Book getBook(int id) {
		Session session=sessionFactory.getCurrentSession();
		Book b=session.get(Book.class, id);
		return b;
	}

	@Override
	@Transactional
	public void deleteBook(int id) {
		Session session=sessionFactory.getCurrentSession();
		Book book=session.get(Book.class, id);
		session.remove(book);
			

	}


}
