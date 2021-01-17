package com.lang;

class Student{
int age;
//static int id=35;
void change() {
	System.out.println(age);
}
}

public class Demo {
	
	/*
	 * static String name; public static void main(String[] args) {
	 * System.out.println(name); }
	 */
	
	/*
	 * int age; public static void main(String[] args) { System.out.println(age);
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) {
		Student s1=new Student();
		//s1.id=45; //it reassign the 45 valye
		s1.change();
		//System.out.println();
	}
}
