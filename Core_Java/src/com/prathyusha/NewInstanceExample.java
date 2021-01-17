package com.prathyusha;

public class NewInstanceExample {
	
    String name = "Prathyusha"; 
   
    //@SuppressWarnings("rawtypes")
    public static void main(String[] args) 
    { 
        
    	try
        { 
    		@SuppressWarnings("rawtypes")
            Class cls = Class.forName("NewInstanceExample");
            
            NewInstanceExample obj = 
                    (NewInstanceExample) cls.newInstance(); 
            System.out.println(obj.name); 
        } 
        catch (ClassNotFoundException e) 
        { 
            e.printStackTrace(); 
        } 
        catch (InstantiationException e) 
        { 
            e.printStackTrace(); 
        } 
        catch (IllegalAccessException e) 
        { 
            e.printStackTrace(); 
        } 
    } 

}
