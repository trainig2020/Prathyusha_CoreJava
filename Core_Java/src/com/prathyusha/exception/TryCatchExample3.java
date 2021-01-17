package com.prathyusha.exception;

public class TryCatchExample3 {

	public static void main(String[] args) {
		
		  int i=100;  
	        int j=0;  
	        int data;  
	        try  
	        {  
	        data=i/j;  
	        }  
	            // handling the exception  
	        catch(Exception e)  
	        {  
	             // resolving the exception in catch block  
	            System.out.println(i/(j+2));  
	        }  
	    }  

}
