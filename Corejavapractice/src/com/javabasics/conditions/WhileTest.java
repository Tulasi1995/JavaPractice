package com.javabasics.conditions;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		while(i<20) {
			System.out.println(""+i);
			i--;
		}
		System.out.println("hey I am unreachble statement");

		do {
			// at least one time it will execute 
			System.out.println("hello I am infinite");
			i++;
		}while(i<30);
			
		
		do {
			//System.out.println(" at least once I wil run even though condition fails "+i);
			//i++;
		}while(true);
		
		
	}

}
