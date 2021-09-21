package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateRecord {
	public static void main(String ar[]) {

		final String DB_URL = "jdbc:mysql:/jdbc_schema";
		final String USER = "root";
		final String PASS = "Mysql";

		try (

				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stm = conn.createStatement();) {

			String sql = "create table customer" + "(id integer not null," + "age varchar(255), "
					+ "address varchar(255)," + "salary integer," + "primary key(id))";
			stm.executeUpdate(sql);
			System.out.println("Table is created");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}