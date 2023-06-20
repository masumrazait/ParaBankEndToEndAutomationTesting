package com.parabank.dbTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.parabank.utilities.TestConfig;

public class DbManager {
	private static Connection con = null;
	private static Connection conn = null;

	public static void setDbConnection() {
		try {
			Class.forName(TestConfig.driver);
			con = DriverManager.getConnection(TestConfig.dbConnectionUrl, TestConfig.dbUserName, TestConfig.dbPassword);

			if (!con.isClosed())
				System.out.println("Successfully connected to SQL Server");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public static void setMsqlDbConnection() {
		try {
			Class.forName(TestConfig.mysqldriver).newInstance();
			conn = DriverManager.getConnection(TestConfig.mysqlurl, TestConfig.mysqluserName, TestConfig.mysqlpassword);

			if (!conn.isClosed())
				System.out.println("Successfully connected to the MySQL WorkBench" + "\n");
		} catch (Exception e) {
			System.out.println("Cannot connect to the Database Server");
		}
	}

	public static List<String> getMySqlQueryTable(String query) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		List<String> values1 = new ArrayList<String>();
		while (rs.next()) {
			values1.add(rs.getString(1));
			values1.add(rs.getString(2));
			values1.add(rs.getString(3));
			values1.add(rs.getString(4));
		}

		return values1;
	}

	public static List<String> getMySqlQueryFromView(String query) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		List<String> values2 = new ArrayList<String>();
		while (rs.next()) {
			values2.add(rs.getString(1));
			values2.add(rs.getString(2));
			values2.add(rs.getString(3));
			values2.add(rs.getString(4));
		}

		return values2;
	}

	public static ResultSet executeQuery(String query) throws SQLException {
		Statement st = conn.createStatement();
		return st.executeQuery(query);
	}
}
