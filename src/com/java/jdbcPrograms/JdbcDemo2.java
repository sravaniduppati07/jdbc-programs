package com.java.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo2 {

	public static void main(String[] args) {
		
		//String insertSql= "INSERT INTO employee (EmpName,empemail,EmpSalary,deptId) VALUES (?,?,?,?)";
		// String updateSql= "UPDATE Employee set EmpName=?,empemail=?,EmpSalary=?,deptId=? where EmpID= 4 ";
		
		 String deleteSql= "delete from Employee where EmpID = ?";
		
		try {
			Connection 	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Sravani@123");
			PreparedStatement pdst= con.prepareStatement(deleteSql);
			
			System.out.println("deleteSql====="+deleteSql);
				
				pdst.setInt(1,3);
				
				//pdst.setString(1,"Priyanka");
				//pdst.setString(2,"Priyaka@gmail.com");
				//pdst.setLong(3,99000);
			  //  pdst.setInt(4,112);
			    
				
				int rowsAffected = pdst.executeUpdate();
				
				System.out.println(rowsAffected + "row() deleted.");
			}
			
			
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
	
			
		
			

		
