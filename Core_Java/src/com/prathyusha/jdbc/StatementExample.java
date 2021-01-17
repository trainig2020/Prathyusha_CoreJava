package com.prathyusha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_jdbc1","root","root");	
        Statement st=con.createStatement();
      //  String sqlQuery="insert into emp values('Aparna',408,30000,'banglore')";
        //String sqlQuery1="insert into emp values('Mahesh',410,60000,'hyderabad')";
      // String sqlQuery="delete from employees where en0=409";
     String sqlQuery1="update emp set name='anu',salary=100000 where id=408";
        int count=st.executeUpdate(sqlQuery1);
        System.out.println("Record Inserted count:"+count);
        con.close();
        System.out.println("Connection closed");

	}

}
