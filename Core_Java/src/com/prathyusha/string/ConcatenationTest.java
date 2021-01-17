package com.prathyusha.string;

public class ConcatenationTest {

	public static void main(String[] args) {
		
		 long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Hello");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Prathyusha");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Hello");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Prathyusha");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	}

}
