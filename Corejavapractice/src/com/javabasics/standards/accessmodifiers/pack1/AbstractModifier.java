package com.javabasics.standards.accessmodifiers.pack1;

public abstract class AbstractModifier {

	abstract void tulasi();
	abstract void tulasi1();
	abstract void tulasi2();
	// void tulasi3(); // if we don't have body for that then we have to declare it as abstract
	void tulasi4() {
		System.out.println("hey I am non abstact");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
