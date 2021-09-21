package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcDemo {
	public static void main(String args[]) throws SQLException {

   
   final String DB_URL = "jdbc:mysql:/jdbc_schema";
   final String USER = "root";
   final String PASS = "Mysql";

 
      // Open a connection
      try (
    	  
    	  
    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stm = conn.createStatement();   
         ){
    	  
    	  String sql= "create database statement";
    	  stm.executeUpdate(sql);
    	  System.out.println("connected...");         
	}
         
      
      catch (Exception e) {
         e.printStackTrace();
      } 
      

   }
}