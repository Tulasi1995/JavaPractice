package com.javabasics.methodreferences;

/**
 * 
 * @author TulasiRam G
 *
 *This class is for instance method  references 
 *this happens with the help of object reference 
 */
public class Methodreference2 {

	 public String greetings(String name) {
		 
		 return "Hey Mr/Ms "+name;
	 }
	public static void main(String[] args) {

		
		// one way is to create class pbject 
		Methodreference2 ref= new Methodreference2();
		
		Greetings greet= ref::greetings;
		
		// another method by using anonymous  Object
		Greetings greet2 = new Methodreference2()::greetings;
		
		System.out.println(greet.greet("Tulasi"));
		System.out.println("anonymous object "+greet2.greet("Kathi"));
	}
	
	interface Greetings{
		
		String greet(String name);
	}

}
