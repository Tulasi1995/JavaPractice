package com.javabasics.innerClasses;

public class AnnonamusInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tulasi t= new Tulasi(){
			
			public void doSomeThing(){
				System.out.println("I am annonamus inner class");
			}
		};
		
		t.doSomeThing();	
	}
}

 interface Tulasi{
	
	 void  doSomeThing();
}
