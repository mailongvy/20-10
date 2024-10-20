package com.model;

public class BookModel {
	private int id;
	private String book_name;
	private String book_edition;
	private double book_price;
	public BookModel() {
		super();
	}
	
	
	
	
	
	public BookModel(int id) {
		super();
		this.id = id;
	}





	public BookModel(String book_name, String book_edition, double book_price) {
		super();
		this.book_name = book_name;
		this.book_edition = book_edition;
		this.book_price = book_price;
	}



	public BookModel(int id ,String book_name, String book_edition, double book_price) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.book_edition = book_edition;
		this.book_price = book_price;
	}


	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_edition() {
		return book_edition;
	}
	public void setBook_edition(String book_edition) {
		this.book_edition = book_edition;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BookModel [book_name=" + book_name + ", book_edition=" + book_edition + ", book_price=" + book_price
				+ "]";
	}
}
