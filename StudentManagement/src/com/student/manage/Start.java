package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("welcome to our menu driven app");
		
		while(true) {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DISPLAY STUDENT");
			System.out.println("PRESS 3 TO DELETE STUDENT");
			System.out.println("PRESS 4 TO UPDATE STUDENT");
			System.out.println("PRESS 5 TO EXIT APP");
			int c=Integer.parseInt(br.readLine());
			switch(c) {
			case 1:
				System.out.println("ADD STUDENT");
				System.out.println("enter his name");
				String name=br.readLine();
				System.out.println("enter his phone");
				String phone=br.readLine();
				//creating object with help of these info
				Student student=new Student(name,phone);
				StudentDao dao=new StudentDao();
				boolean f=dao.insertStudent(student);
				if(f) {
					System.out.println("added successfully");
				}
				else {
					System.out.println("somthing went wrong");
				}
				System.out.println(student);
				
				break;
			case 2:
				System.out.println("for to DISPLAY STUDENT,enter his Id");
				int id=Integer.parseInt(br.readLine());
				StudentDao dao1=new StudentDao();
				dao1.selectStudent(id);
				
				break;
			case 3:
				System.out.println("DELETE STUDENT");
				break;
			case 4:
				System.out.println("UPDATE STUDENT");
				break;
			default:
				System.out.println("EXIT STUDENT");
				
			}
			System.out.println("Thank you for using my application");
		}

	}

}
