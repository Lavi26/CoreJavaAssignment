package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
    public static void main(String ar[]) throws SQLException {

 
    	   Connection connection = null;
    	   final String DB_URL = "jdbc:mysql:/jdbc_schema";
    	   final String USER = "root";
    	   final String PASS = "Mysql";

    
    	      try {
    	    	  
    	    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	    	  connection = DriverManager.getConnection(DB_URL, USER, PASS);/// authentication
    	    	  
    	    	  System.out.println("connected...");
                  Statement statement = connection.createStatement();// this used for creating sql statement

              /*String sql = "CREATE TABLE customer " + "(id INTEGER not NULL, " +
              " age VARCHAR(255), " + " address VARCHAR(255), " + " salary INTEGER, " +
              " PRIMARY KEY ( id ))";*/
             

 
             //for storing data into table
            String insert = "INSERT INTO CUSTOMER VALUES (1,'30','Delhi',20000);";
            statement.executeUpdate(insert);
            System.out.println("done...");

 

        
        } catch (Exception e) {
            e.printStackTrace();

 

        }

 

    }

 

}