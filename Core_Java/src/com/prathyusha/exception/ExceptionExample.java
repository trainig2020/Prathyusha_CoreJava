package com.prathyusha.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		
		 try{  
		      //code that may raise exception  
		      int data=500/0;  
		   }
		 catch(ArithmeticException e){
			   System.out.println(e);
			   }  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  
	}

