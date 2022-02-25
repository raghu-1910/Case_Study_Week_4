package com.ac.service;

import com.ac.bean.Book;
import com.ac.dao.BookDAO;

public class BookService {
	//Add method for book
	public int addBookService(int bookId,String bookTitle,float bookPrice)
	{
		//for grade condition
		String bookGrade;
		if(bookPrice<=500)
		{
			bookGrade="C";
		}
		else if(bookPrice<=700)
		{
			bookGrade="B";
		}
		else {
			bookGrade="A";
		}
		BookDAO bDAO = new BookDAO();
		Book bk = new Book(); //create object og book class for setting a all the fields
		//Setting the book,id,pricr,title and grade
		// wrap up all the fields 
		bk.setBookId(bookId);
		bk.setBookTitle(bookTitle);
		bk.setBookPrice(bookPrice);
		bk.setBookGrade(bookGrade);
		//Use try and catch block for Exception Handle
		try {
		int updCount = 0 ;
		updCount = bDAO.addBook(bk);
		return updCount;
		}
		catch(Exception e) {
			System.out.println(e.toString());
			return 0;
		}
		
		
	}

}
