package com.javabasics.strings;

public class Student {
	
	int id;
	String name;
	int age;
	

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String toString(){
		
		
		return id+" "+name+" "+age;
	}
	


	public static void main(String[] args) {
  Student s= new Student(10,"Tulasi",24);
  
  System.out.println(s); // when we print the object it will call toString method 
  //if we override object class toString Method then we can get our desired things if not then hashcode will be printed 
  
  //overrided to string method
		
	}

}
