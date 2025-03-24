package com.java.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		
		//class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Sravani@123");
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from Employee where empSalary>80000");
		
		while (rs.next()) {
				System.out.println(rs.getInt("empId")+"  "+rs.getString("empName"));
		}
		
		rs.close();
		st.close();
		con.close();
		

	}

}
