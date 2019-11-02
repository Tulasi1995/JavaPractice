package com.javabasics.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList c=new ArrayList();
		Test t=() ->{
			return "Tulasi Ram";
		};
		
		System.out.println(t.m1());
		
		System.out.println(c instanceof Iterable);
		
		Iterator i=c.iterator();

	}

}

interface Test{
	
	abstract String m1();
}
