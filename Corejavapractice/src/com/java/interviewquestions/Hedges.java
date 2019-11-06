package com.java.interviewquestions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

public class Hedges {
	
	public static void main(String args[]) {
		Employee employee1 = new Employee();
		employee1.setId(1001);
		employee1.setName("John");
		Employee employee2 = new Employee();
		employee2.setId(1002);
		employee2.setName("Kelvin");
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee2);
		employeeList.add(employee1);
		
		//Collections.sort(employeeList);
		//collections sort method accepts only List<T> not any object type

		System.out.println(employeeList.get(0).getName());
		System.out.println(employeeList.get(1).getName());
	} 
}