package com.prathyusha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_jdbc1","root","root");
		String sqlQuery="insert into emp values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sqlQuery);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Employee Name:");
			String ename=sc.next();
			System.out.println("Employee Number:");
			int eno=sc.nextInt();
			System.out.println("Employee Salary:");
			double esal=sc.nextDouble();
			System.out.println("Employee Address:");
			String eaddr=sc.next();
			
			pst.setString(1, ename);
			pst.setInt(2, eno); 
			pst.setDouble(3, esal);
			pst.setString(4, eaddr);
			
			pst.executeUpdate();
			
			System.out.println("Record Inserted Successfully");
			System.out.println("Do you want to insert one more record[Yes/No]:");
			String option=sc.next();
			if(option.equalsIgnoreCase("No"))
			{
				break;
			}

			
			
		}


	}

}
