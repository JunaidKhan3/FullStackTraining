package com.Application.rest.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {

	//public static void main(String[] args) {
	public static void testConnection() {
		Connection con = null;
		Statement stmt = null;
		try {
			// load a driver
			Class.forName("com.mysql.jdbc.Driver");

			// creating a connection
			String url = "jdbc:mysql://localhost:3306/restapi";
			String username = "root";
			String password = "Root12345";

			// Connection
			// con=DriverManager.getConnection("jdbc:mysql//localhost:3306/employee","root","Admin12345");

			// or
			con = DriverManager.getConnection(url, username, password);

			
			if (con.isClosed()) {
				System.out.println("Connection is closed...");
			} else {
				System.out.println("Connection created...");
			}

			
			
			stmt = con.createStatement();
			// process a result
			ResultSet rs = stmt.executeQuery("select * from instructor");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getInt(3) + "," + rs.getInt(4) + ","
						+ rs.getString(5));

			}
			// close connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
