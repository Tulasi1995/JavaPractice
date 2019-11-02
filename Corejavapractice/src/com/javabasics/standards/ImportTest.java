package com.javabasics.standards;
import java.util.*; 
import java.sql.*;
import static java.lang.Math.sqrt;
import static java.lang.Math.*;
public class ImportTest {
  
	static char c;
	

	public static void main(String args[]) 
	{ 
	//Date d=new Date(); // the date type is ambiguous 
		// with out static import 
		System.out.println(Math.sqrt(4));
		System.out.println(Math.max(10,20));
		System.out.println(Math.random());
		
		// with static import
		// static imports creates confusion
		System.out.println(sqrt(4));
		System.out.println(max(10,20));
		System.out.println(random());
		System.out.println("default value of char is space "+ImportTest.c);
		
		
		
	}
}
