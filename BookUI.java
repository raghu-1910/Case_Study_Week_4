package com.ac.ui;

import java.util.Scanner;

import com.ac.service.BookService;

public class BookUI {
	public static void main(String[] args) {
		int bookId=0;
		String bookTitle;
		float bookPrice;
		//End user input using Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book ID:");
		bookId = sc.nextInt();
		System.out.println("Enter book Title:");
		bookTitle = sc.next();
		System.out.println("Enter book Price:");
		bookPrice = sc.nextFloat();
		BookService bookService = new BookService();
		int updCount = bookService.addBookService(bookId, bookTitle, bookPrice);//updCount store the how many store data
		System.out.println("Inserted "+updCount+" Reorded Successfully !");
		
	}

}
