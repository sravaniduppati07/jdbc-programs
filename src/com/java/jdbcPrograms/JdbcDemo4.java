package com.java.jdbcPrograms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo4 {

	public static void main(String[] args) throws SQLException {
		
Connection 	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Sravani@123");
		
		CallableStatement cs=con.prepareCall("{call getSalarydetails()}");
		
		ResultSet rs =cs.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("EmpSalary"));
		}
	
	}
		}




