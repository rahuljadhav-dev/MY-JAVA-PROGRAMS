package jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;


public class Task1 {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
		System.out.println("Enter ID :");
		int id=sc.nextInt();
		System.out.println("Enter Name :");
		String name=sc.next();
		System.out.println("Enter Salary :");
		int salary=sc.nextInt();
		PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?);");
		st.setInt(1, id);
		st.setString(2, name);
		st.setInt(3, salary);
		st.executeUpdate();
		System.out.println("Employee added!");
//		Statement stmt=con.createStatement();
//		stmt.execute("insert into employee values(?,?,?)");
//		System.out.println("emplloyee added!");
		
	}

}
