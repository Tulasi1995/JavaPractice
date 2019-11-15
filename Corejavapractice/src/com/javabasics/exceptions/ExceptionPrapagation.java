package com.javabasics.exceptions;

/**
 * 
 * @author G Tulasi Ram
 *
 */
public class ExceptionPrapagation {
	
	public static void main(String[] args)  {
		//Exception4.m3();
		throw new ArithmeticException();
	}

}

class Exception4{
	static void m3() {
		Exception2.m2();
		
	}
	
	
}

class Exception2{
	
	static void m2() throws NullPointerException {
	
		Exception3.m1();
	
	}
}
class Exception3{
	 
	static void m1(){
		
		try {
			System.out.println(" issue "+10/0);
		}catch(Exception e ) {
			System.out.println("problem occured do this ");
			System.out.println(" issue "+10/2);
		}
	}
	
}
