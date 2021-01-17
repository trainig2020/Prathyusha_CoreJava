package com.lang;


  interface Drawable{
	  void draw();
	  }
  
  interface Printable{
	  void draw();
	  }
  
  class Rectangle implements Drawable,Printable{
  
  @Override
  public void draw() { 
	  // TODO Auto-generated method stub
  
  System.out.println("Rectangle");
  
  }
  
  
  }
  
  class Square implements Drawable,Printable{
  
  @Override public void draw() {
	  // TODO Auto-generated method stub
  System.out.println("Square");
  
  }
  
  }
  
  
  
  
  public class InterfaceDemo {
  
  public static void main(String[] args) {
	  Printable rect =new Rectangle();
  
  //Rectangle rect =new Rectangle(); 
	  rect.draw(); 
	  Square square = new Square();
     square.draw();
  
  }
  
  }
 

