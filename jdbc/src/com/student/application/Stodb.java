                                                               package com.student.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Stodb {
	public static boolean inserttoDB(Student s) {
		boolean f=false;
		try {
			Connection con=CP.getCon();
			String q="insert into students(sid,sname,sphone,scity)values(?,?,?,?)";
			PreparedStatement st=con.prepareStatement(q);
			st.setInt(1, s.getStudentId());
			st.setString(2, s.getStudentName());
			st.setString(3, s.getStudentPhone());
			st.setString(4, s.getStudentCity());
			st.executeUpdate();
			f=true;



		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	public static boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection con=CP.getCon();
			String q="delete from students where sid=?";
			PreparedStatement st=con.prepareStatement(q);
			st.setInt(1, id);

			st.executeUpdate();
			f=true;



		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;

	}

	public static void displayStudent() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection con=CP.getCon();
			String q="select * from students";
			Statement stt=con.createStatement();
			ResultSet ste= stt.executeQuery(q);
			while(ste.next()){
				int id=ste.getInt(1);
				String name=ste.getString(2);
				String phone=ste.getString(3);
				String city=ste.getString(4);
				System.out.println("Student name :"+name);
				System.out.println("Student ID:"+id);
				System.out.println("Student Phone:"+phone);
				System.out.println("Student city"+city);
				System.out.println("****************");
			}
		}



		catch (Exception e) {
			// TODO: handle exception
		}


	}

	public static boolean updateUser(int id,String name) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection con=CP.getCon();
			String q="update students set sid=? where sname=?";
			PreparedStatement st=con.prepareStatement(q);
			st.setInt(1, id);
			st.setString(2, name);

			st.executeUpdate();
			f=true;



		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}




}
