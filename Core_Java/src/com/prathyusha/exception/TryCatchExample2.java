package com.prathyusha.exception;

public class TryCatchExample2 {

	public static void main(String[] args) {
	
		 try  
	        {  
	        int data=50/0;    
	        }  
	             // handling the exception  
	        catch(Exception e)  
	        {  
	                  // displaying the custom message  
	            System.out.println("Can't divided by zero");  
	        }  
	    }  
	      
	}

