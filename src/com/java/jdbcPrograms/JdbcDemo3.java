package com.java.jdbcPrograms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class JdbcDemo3 {

	public static void main(String[] args) throws Exception
	{
		 
		
		String callProcedureSQL = "{call GetAllEmployees()}";
		
			Connection 	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Sravani@123");
			
			CallableStatement cbst =con.prepareCall(callProcedureSQL);
			
			ResultSet rs=cbst.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("EmpID")+"     "+rs.getString("EmpName"));
			}
			
	}

}
