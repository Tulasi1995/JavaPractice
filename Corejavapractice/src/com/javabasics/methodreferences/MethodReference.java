package com.javabasics.methodreferences;


/**
 * 
 * @author TulasiRam G
 *
 *This class gives examples about static method reference
 */
public class MethodReference {

	public static void message() {
		
		System.out.println(" Greetings from static class");
	}
	
	static int addition(int i,int j) {
		
		return i+j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greetings greet= MethodReference::message;
		
		greet.greet();
		
		MathCalu cal=MethodReference::addition;
		
		System.out.println(cal.opearation(20, 50));

	}
	
	interface Greetings{
		
		 void greet();
	}
	
	interface MathCalu{
		
		int opearation(int i,int j);
	}

}
