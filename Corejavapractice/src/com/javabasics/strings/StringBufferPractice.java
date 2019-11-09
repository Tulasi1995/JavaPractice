package com.javabasics.strings;

/**
 * 
 * @author G Tulasi Ram
 *
 *String Buffer is synchronized class
 */
public class StringBufferPractice {

	public static void main(String[] args) {

		StringBuffer s=new StringBuffer("Tulasi is a mutable string");
		
		 // StringBuffer s1="Hello Boys";  we can't declare StringBuffer like String class 
		
		s.append(" shit it's like object type");
		
		System.out.println(s);
	}

}
