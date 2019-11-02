package com.javabasics.staticFlowVsNonStaticFlow;

public class StaticTest1 {
	static int i=200;
	int y=20;

	
	//for every object new set of instance variables will be created 
	// for static only once they created and shared for total class 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest1 t1=new StaticTest1();
		StaticTest2 t2=new StaticTest2();
		t1.i=400;
		t1.y=600;
		System.out.println(t2.i+" value  "+t2.y);
		t2.method1();
	}

}
