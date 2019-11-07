package com.javabasics.exceptions;

import java.io.FileNotFoundException;

public class Exception1 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Exception1 e1=new Exception1();
		// arhtimetic exception 
		//System.out.println(10/0);
		//e1.m1();
		try {
			e1.m1();
			//e1.main(args);
			//Exception1.main(args);
		}catch(ArithmeticException e) {
			
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		System.out.println("errro occured ");
		System.out.println(10/2);
	}

	void m1() throws FileNotFoundException,NullPointerException,ArithmeticException {
		// this method not handling any exceptions so this needs to taken care by caller methods 
		System.out.println(10/0);
	}
}
