package com.prathyusha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/emp_data","root","root");  
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
				System.out.println(rs.getString(1)+" "+rs.getInt(2)); 
	            con.close();  
			}
		   catch(Exception e){ System.out.println(e);}  

	}

}
