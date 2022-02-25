package com.ac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ac.bean.Book;

//DAO which is intereact with database
public class BookDAO {
	public int addBook(Book bk)
	{
		Connection con=null;
		PreparedStatement pstmt = null;
		try {
			con=BookDtBs.getConnection();//loading the driver class
			
			String ins_str="insert into book values(?,?,?,?)";//create the statement
			pstmt = con.prepareStatement(ins_str);
			pstmt.setInt(1, bk.getBookId());
			pstmt.setString(2, bk.getBookTitle());
			pstmt.setFloat(3,bk.getBookPrice());
			pstmt.setString(4, bk.getBookGrade());
			int updCount = pstmt.executeUpdate();//Execute Query using user define executeQuery
			con.close();//mendatory to close connection after all excution
			return updCount;
		}
		catch(Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
	public ArrayList getBookDetailsById(int bookId)
			throws Exception{
		//initially assigning all the things null
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs=null;
				
				con = BookDtBs.getConnection();//Loading the driver class
				String sel_str = "select bookTitle,bookPrice,bookGrade from book where bookId=?";//create statement
				pstmt = con.prepareStatement(sel_str);
				pstmt.setInt(1, bookId);
				rs = pstmt.executeQuery();//Execute query
				ArrayList result = new ArrayList();//using arraylist store and show the data
				if(rs.next())
				{
					result.add(rs.getString(1));
					result.add(rs.getString(2));
				}
				else {
					result.add("Invaild Id!");
				}
				return result;
			
		}
	

}
