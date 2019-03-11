package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="book_hib")
public class Book {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="book_id")
int id;

@Column(name="title")
String title;

@Column(name="author")
String author;

@Column(name="price")
float price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int id, String title, String author, float price) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.price = price;
}
public Book(String title, String author, float price) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
}

	
}
