package basic;

import java.sql.*;

public class jdbc {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String username="root";
		String password = "9159608502";
		String query="select * from employee";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		System.out.println("Id is "+ rs.getInt(1));
		System.out.println("Name is "+ rs.getString(2));
		System.out.println("Salary is "+ rs.getInt(3));
		
		con.close();
		
}
}
