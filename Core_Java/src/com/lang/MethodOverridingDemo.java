package com.lang;

class Vehicle { 
	void run() {
		System.out.println("Vehicle is running");
		
	}
	
	void start()
{
		System.out.println("vehicle is started");
		}
}

class Bike extends Vehicle{
	void run() {
		//super.run();
		System.out.println("Bike is running");
	}

	void stop()
{
		System.out.println("vehicle is stopped");
		}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle bike= new Bike();
		//bike.run();
		Vehicle bike= new Bike();
		bike.run();
		bike.start();
		
		
		

	}

}


/*
 * class vehicle{ Number run() { return 1; }
 * 
 * }
 * 
 * class Bike extends Vehicle{ Integer run() { return 3; } }
 */