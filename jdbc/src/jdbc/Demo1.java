package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) throws Exception  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bid :");
		int bid=sc.nextInt();
		System.out.println("Enter book name :");
		String bname=sc.next();
		System.out.println("Enter author name :");
		String aname=sc.next();
		System.out.println("Enter price :");
		int price=sc.nextInt();
		System.out.println("Enter year");
		String year=sc.next();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		PreparedStatement st=c.prepareStatement("insert into books values("+bid+",'"+ bname+"','"+aname+"',"+price+",'"+year+"');");
		st.executeUpdate();
//		while(rs.next()) {
//			System.out.println("The book name is :"+rs.getString("Book_Name")+" & Price of book:"+rs.getInt("Price"));
//		}
		
	
	}

}
