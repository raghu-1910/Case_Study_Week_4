package com.ac.bean;

public class Book {
	//Creating attributes of book
	private int bookId;
	private String bookTitle;
	private float bookPrice;
	private String bookGrade;
	//now we an genrate gettters and setters
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookGrade() {
		return bookGrade;
	}
	public void setBookGrade(String bookGrade) {
		this.bookGrade = bookGrade;
	}
	//Default Constructor
	public Book() {
		// TODO Auto-generated constructor stub
	}
	//Generate Constructor
	public Book(int bookId, String bookTitle, float bookPrice, String bookGrade) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.bookGrade = bookGrade;
	}
	@Override
	//Generate To String Method
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + ", bookGrade="
				+ bookGrade + "]";
	}
	
	
}
