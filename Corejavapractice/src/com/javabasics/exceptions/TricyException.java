package com.javabasics.exceptions;

public class TricyException {
	
	static ArithmeticException  e;
	
	public static void main(String[] args) {
		
		try{
			System.out.println(10/2);
			throw e;
		}catch(ArithmeticException e) {
			System.out.println(" whats next");
		}
	}

}
