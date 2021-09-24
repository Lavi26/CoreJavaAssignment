package com.jdbcemppackage;

//For creating table in the database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmpDeptTable {
	
	public static void main(String args[]) {
		
		//Connection connection=null;
		final String username="root";
		final String password="Mysql";
		final String jdbcurl = "jdbc:mysql:/jdbc_schema";
		try (
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(jdbcurl,username,password);
			Statement statement=conn.createStatement();
			){
			System.out.println("Connected........");
			//connection.close();
			
		
			//For creating the table EMP
			String emptable="create table emp"
					+ "(empno number(4,0),"
					+ "ename varchar2(10),"
					+ "job varchar2(9),"
					+ "mgr number(4,0),"
					+ "hiredate date,"
					+ "sal number(7,2),"
					+ "comm number(7,2),"
					+ "deptno number(2,0),"
					+ "constraint pk_emp primary key (empno),"
					+ "constraint fk_deptno foreign key (deptno) references dept (deptno))";
			statement.executeUpdate(emptable);
			System.out.println("Table is created ");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/*finally {
			conn.close();
			statement.close();*/
		}
	

}