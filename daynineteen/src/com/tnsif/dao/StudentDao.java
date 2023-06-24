package com.tnsif.dao;
//this layer contains the necessary databse information

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDao {
	/*A connection (session) with a specificdatabase. 
	 * SQL statements are executed and results are 
	 * returned within the context of a connection. */
	public Connection createConnection()
	{
		//to connect with the database
		String url="jdbc:mysql://localhost:3306/fastandfurius";
		String username="root";
		String password="119Shu01";
		
		try {
			/*if driver class name is an incorrect then
			 * it will be handle by using catch block
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Invalid Driver class Name");
		}
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("Invalid Credentials");
			connection=null;
		}
		return connection;
	}

}
