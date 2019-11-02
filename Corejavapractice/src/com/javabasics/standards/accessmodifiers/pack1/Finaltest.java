package com.javabasics.standards.accessmodifiers.pack1;

public class Finaltest {
	
	//final static int i; // if we declare a instance or static variable as final then we should declare value 
 final int j; // j=10;
 
 //1 way 
 {
	 //j=10;
 }
 //2 nd way
 Finaltest(){
	 j=20;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Finaltest test=new Finaltest();
		//System.out.println(test);
		
		final Customer c=new Customer("tulasi",10); // C referenced wil not be changed because it final
		// we can change the customer name like below 
		c.setName("Rajsjh");
		// to get const corrective nesss declare name variable as final
		
		System.out.println(c.getName());
		
	}

}
