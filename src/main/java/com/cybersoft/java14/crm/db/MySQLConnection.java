package com.cybersoft.java14.crm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cybersoft.java14.crm.util.DbConst;

public class MySQLConnection {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(DbConst.MYSQL_URL, DbConst.USERNAME, DbConst.PASSWORD);
		} catch (SQLException e) {
			System.out.println("Can not connect to DB.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Driver MySql Connector J not found.");
			e.printStackTrace();
		}
		return null;
	}
}
