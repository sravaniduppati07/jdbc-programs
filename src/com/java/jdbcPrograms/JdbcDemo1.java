package com.java.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Sravani@123");

	Statement st= con.createStatement();
	 
	//int rs= st.executeUpdate("insert into employee(EmpName,empemail,EmpSalary,deptId) values('Peter','sr@gmail.com',98000.00,111)");
	
	//int rs= st.executeUpdate("delete from Employee where EmpID=14");
	int rs= st.executeUpdate("update Employee set EmpName='Preethi' where EmpID=24");
	
	
	
	
	st.close();
	con.close();
	} 
	// TODO Auto-generated catch block
  
	
	
	}

