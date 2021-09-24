package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 

public class ViewRecord {
    public static void main(String ar[]) {

 


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

 

            // for retrieve we use resultset

            selectsql = "select * from CUSTOMER ";

            ResultSet rs = statement.executeQuery(selectsql);

 

            while (rs.next()) {
                System.out.print("ID is: " + rs.getInt("id"));
                System.out.print("age is: " + rs.getString("age"));
                System.out.print("addres: is " + rs.getString("address"));
                System.out.print("salary is : " + rs.getString("salary"));

 

            }

 

        } catch (Exception e) {
            e.printStackTrace();

 

        }

 

    }

 

}
 