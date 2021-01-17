package com.prathyusha;

public class CloneExample implements Cloneable  {
	
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	 String name = "Prathyusha"; 
	 
	public static void main(String[] args) 
	    { 
	        CloneExample obj1 = new CloneExample(); 
	        try
	        { 
	            CloneExample obj2 = (CloneExample) obj1.clone(); 
	            System.out.println(obj2.name); 
	        } 
	        catch (CloneNotSupportedException e) 
	        { 
	            e.printStackTrace(); 
	        } 
	    } 

}
