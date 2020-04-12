package com.apt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class TestJDBC {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=School;" + "integratedSecurity=true";

		
		try {
			// connect database
			// username & password
			Properties properties = new Properties();
			properties.setProperty("user_name", "sa3");
			properties.setProperty("password", "12345");

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// connect
			Connection connection = DriverManager.getConnection(jdbcUrl, properties);
			System.out.println("Connect successful!");

			// close connection
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
