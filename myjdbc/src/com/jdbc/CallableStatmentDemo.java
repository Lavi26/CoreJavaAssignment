package com.jdbc;

import java.sql.*;


/*           create or replace procedure "INSERTR"  
                   (id IN NUMBER,name IN VARCHAR2)  
                is  
                   begin  
                       insert into user420 values(id,name);  
               end;  
/  */

public class CallableStatmentDemo {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:/jdbc_schema", "root", "Mysql");

		CallableStatement stmt = con.prepareCall("{call insertR(?,?)}");  //callablestatemnt
		stmt.setInt(1, 1011);
		stmt.setString(2, "Amit");
		stmt.execute();

		System.out.println("success");
	}
}