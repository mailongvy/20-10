package com.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class Util {
	public static Connection getConnecttion() {
		Connection c = null;
		
		try {
			// register the oracle JDBC driver with DriverManager
			// Đăng kí Mysql driver với drivermanager
			DriverManager.registerDriver(new Driver());
			
			// các thông số thông tin cơ bản
			String url = "jdbc:mySQL://localhost:3306/nhsach";
			String username = "root";
			String password = "787878";
			
			//Tạo kết nối
			c = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return c;
		
	}
	
	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static void printInfo(Connection c) {
		if (c != null) {
			try {
				 DatabaseMetaData mtdt = c.getMetaData();
//				 System.out.println(c.getMetaData().toString());
				 System.out.println(mtdt.getDatabaseProductName());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	
	
	
}
