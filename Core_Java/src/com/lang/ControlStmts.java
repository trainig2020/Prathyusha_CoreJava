package com.lang;

public class ControlStmts {
	
	
	
	public static void main(String[] args) {
		/*
		 * int marks =45;
		 * 
		 * if(marks>65) { System.out.println("pass"); } else {
		 * System.out.println("fail"); }
		 */
		
		
		/*
		 * String day="monday"; switch(day) { case "monday":
		 * System.out.println("It is Monday"); break;
		 * 
		 * 
		 * case "tuesday": System.out.println("It is Tuesday"); break;
		 * 
		 * }
		 */
		
		for(int i=1;i<=2;i++)
		{
			for(int j=0;j<=5;j++) {
				if(j ==2) {
					break;
				}
				System.out.println(j);
			}
		}
}
	
}


