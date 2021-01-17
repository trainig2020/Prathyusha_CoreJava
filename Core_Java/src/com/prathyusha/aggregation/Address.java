package com.prathyusha.aggregation;

public class Address {
	
	private String city;
	private String country;
	private String state;
		
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String city, String country) {
		//super();
		this.city = city;
		this.country = country;
	}
	Address(String city, String country, String state) {
		
		this(city,country);
	
		this.state = state;
	}
	
	void display() {
		System.out.println(city+" "+state);
	}
	
	public static void main(String[] args) {
		Address address= new Address("Chennai","India");
		Address address1= new Address("Chennai","India","TN");
		address.display();
		address1.display();
		
	}
	
	/*
	 * public String getCity() { return city; } public void setCity(String city) {
	 * this.city = city; } public String getCountry() { return country; } public
	 * void setCountry(String country) { this.country = country; }
	 * 
	 * @Override public String toString() { return "Address [city=" + city +
	 * ", country=" + country + "]"; }
	 */
	
	
	
	

}
