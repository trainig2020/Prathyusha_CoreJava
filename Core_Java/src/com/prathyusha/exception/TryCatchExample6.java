package com.prathyusha.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public  class TryCatchExample6 {

	public static void main(String[] args) {
		
	    
        PrintWriter pw;  
        try {  
            pw = new PrintWriter("prathyusha.txt"); //may throw exception   
            pw.println("saved");  
        }  
// providing the checked exception handler  
 catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        }         
    System.out.println("File saved successfully");  

	}

}
