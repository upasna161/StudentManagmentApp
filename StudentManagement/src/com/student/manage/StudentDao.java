package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

	//insert 
	public boolean insertStudent(Student student) {
		boolean f=false;
		try {
	Connection c=ConnectionProvider.createCon();
	String q="insert into students(sname,sphone) values(?,?)";
	//set values of parameters
	
	PreparedStatement pstmt=c.prepareStatement(q);
	pstmt.setString(1,student.getSname());
	pstmt.setString(2,student.getSphone());
	pstmt.executeUpdate();
	f=true;
	//System.out.println("you are in studentDao");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
}
	public boolean selectStudent(int id) {
		boolean f=false;
		try {
	Connection c=ConnectionProvider.createCon();
	String q="select * from students where sid =?";
	//set values of parameters
	
	PreparedStatement pstmt=c.prepareStatement(q);
	pstmt.setInt(1,id);
	
	ResultSet st=pstmt.executeQuery();
	while(st.next()) {
		int ID=st.getInt(1);
		String name=st.getString("sname");
		String phone=st.getString(3);
		System.out.println("ID :"+ID+"name :"+name+" phone :"+phone);
	}
	f=true;
	//System.out.println("you are in studentDao");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
