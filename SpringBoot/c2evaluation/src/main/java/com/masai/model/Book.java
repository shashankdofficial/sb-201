package com.masai.model;

public class Book {
	
	private Integer Book_Id;
	private String name;
	private String author;
	private Integer Price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Integer book_Id, String name, String author, Integer price) {
		super();
		Book_Id = book_Id;
		this.name = name;
		this.author = author;
		Price = price;
	}

	public Integer getBook_Id() {
		return Book_Id;
	}

	public void setBook_Id(Integer book_Id) {
		Book_Id = book_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPrice() {
		return Price;
	}

	public void setPrice(Integer price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Book [Book_Id=" + Book_Id + ", name=" + name + ", author=" + author + ", Price=" + Price + "]";
	}
	

}
