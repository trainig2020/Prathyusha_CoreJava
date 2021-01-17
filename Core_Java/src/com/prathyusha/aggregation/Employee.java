package com.prathyusha.aggregation;

public class Employee {
	
	private int id;
	private String name;
	Address address; //has a address
	

	

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

    public void dispaly() {
    	System.out.println(id+" "+name);
    	System.out.println(address.getCity()+" "+address.getCountry());
    	
    }


	public static void main(String[] args) {
		/*
		 * Address address1 = new Address(); address1.setCity("Chennai");
		 * address1.setCountry("India"); System.out.println(address1);
		 */
		 
	  
		
		/* Employee emp = new Employee(1,"Prathyusha",address1); emp.dispaly(); */
		 
		

	}

}
