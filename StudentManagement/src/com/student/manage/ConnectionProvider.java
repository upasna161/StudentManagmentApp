package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static Connection con;
	public static Connection createCon() {
	   try {
		   //load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student_manage";
		String user="root";
		String password="root";
		//create the connection and store it
		con=DriverManager.getConnection(url,user,password);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	}

}
