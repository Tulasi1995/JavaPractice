package com.javabasics.methodreferences;

public class MethodReference3 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greetings greet=Message::new;
		
		greet.greet("babu");
		
	}
	
	
}

interface Greetings{
	
	Message greet(String name);
}

class Message{
	
	Message(String name){
	System.out.println("hey mr/ms "+name);	
	}
	
}
