package com.prathyusha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_jdbc","root","root");	
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employees");
        while(rs.next())
        {
        	System.out.println(rs.getString(1)+"..."+rs.getInt(2)+"..."+rs.getDouble(3)+"..."+rs.getString(4));
        	
        	
        }
        con.close();

	}

}
