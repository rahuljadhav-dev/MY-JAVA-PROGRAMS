package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo2 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement st=con.prepareStatement("");
//		st.executeUpdate();
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("name")+" "+rs.getInt("no")+" "+rs.getInt("age"));
		}
		
	}

}
