package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) throws Exception{
		//city data
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pin-Code :");
		int pin=sc.nextInt();
		System.out.println("Enter City Name :");
		String city=sc.next();
		System.out.println("Famous Location :");
		String loc=sc.next();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","root");
		PreparedStatement st=c.prepareStatement("insert into cities values("+pin+",'"+city+"','"+loc+"')");
		st.executeUpdate();
		
	}

}
