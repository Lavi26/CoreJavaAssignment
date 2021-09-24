package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
	
	 public static void main(String ar[]) throws SQLException {

		 
	 	   Connection connection = null;
	 	   final String DB_URL = "jdbc:mysql:/jdbc_schema";
	 	   final String USER = "root";
	 	   final String PASS = "Mysql";

	 

	        String selectsql = "";

	        try {
		    	  
		    	  Class.forName("com.mysql.cj.jdbc.Driver");
		    	  connection = DriverManager.getConnection(DB_URL, USER, PASS);/// authentication
		    	  
		    	  System.out.println("connected...");
	            Statement statement = connection.createStatement();// this used for creating sql statement
	            
	            
	            String sql="UPDATE CUSTOMER SET ADDRESS='Ahemdabad' where id=1";
				statement.executeUpdate(sql);
				System.out.println("Record is updated");  
	         } 
	        catch (Exception e) {
	            e.printStackTrace();

	        }
	        finally {
	 			connection.close();
	 			//statement.close();
	 		}

	    }
	


}
