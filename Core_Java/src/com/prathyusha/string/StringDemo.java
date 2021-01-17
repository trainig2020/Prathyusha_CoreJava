package com.prathyusha.string;

public class StringDemo {

	public static void main(String[] args) {
		
		
		 StringBuffer name= new StringBuffer("Hello");
		 System.out.println(name.capacity()); //16
		 name.append(" Prathyusha working in HCL");
		 System.out.println(name);
		 System.out.println(name.capacity()); //44
		
		
		
		
		  StringBuffer name1= new StringBuffer("Hello");
		  System.out.println(name1);
		  System.out.println(name1.capacity()); //16+5 =21 
		  name1.append(" Prathyusha");
		  System.out.println(name1);
		  System.out.println(name1.capacity()); //21 
		  
		  name1.append(" working in hcl bangalore"); 
		  System.out.println(name1);
		  System.out.println(name1.capacity());
		 
		
		
		
	}

}
