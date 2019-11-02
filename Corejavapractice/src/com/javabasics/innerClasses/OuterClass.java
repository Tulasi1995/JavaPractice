package com.javabasics.innerClasses;

public class OuterClass {
	
	String name="TUlasi";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerObject=new OuterClass();
		// with the help of object we can create inner class object
		InnerClass in =outerObject.new InnerClass();
		String prnt=in.m1();
		System.out.println(prnt);
		
		InnerStatic ins =new InnerStatic();
		ins.main(args);
		ins.staticMethod();
		// ins.name; we can't access non static method on outer class with static inner class 
	}
	
	class InnerClass{
		int i=10;
		int k=20;
		// we can't create any static variable or method in inner class which is non-static 
		
		String m1() {
			
			return "I am from Inner class";
		}
	}
	
	static public class InnerStatic{
		static int sts=20;
		void staticMethod() {
			
			System.out.println("I am from static inner class ");
		}
		
		public static String main(String[] args) {
			System.out.println("InnerStatic Main method");
			return "buss";
		}
	}

}
