package com.javabasics;

public class TestConditions {
	
	public static void main(String[] args) {
		
		
		System.out.println('c'+'b'+"calculation ");
		
		System.out.println(" printing pyramid");
		for(int i=0;i<=5;i++) {
			
			for(int j=5-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("printing right angle trangle");
		
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("righr angle triangle reverse");
		for(int i=5;i>0;i--) {
		
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println("");
		}
	}
}
