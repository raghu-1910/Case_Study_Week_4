package com.ac.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDtBs {
	public static Connection getConnection() throws Exception {
		
		String driverName = "org.postgresql.Driver";
		
		Class.forName(driverName);//loading driver
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/store", "postgres", "postgres");
		
		return conn;
}

}
