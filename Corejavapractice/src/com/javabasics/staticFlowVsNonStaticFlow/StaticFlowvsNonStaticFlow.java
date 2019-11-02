package com.javabasics.staticFlowVsNonStaticFlow;

public class StaticFlowvsNonStaticFlow {
	// static block will execute first
	static{
		System.out.println(" static block execute first");
	}
	
	static String dataStatic="I am static variable";
	
	{
		System.out.println("I am non static I will be executed once oject is created ");
	}
     String data="I am non static variable";
     String data2;
     boolean b;
     static String dataStatic2="initial value";
     
	public static void main(String[] args) {
		StaticFlowvsNonStaticFlow obi=new StaticFlowvsNonStaticFlow();
		StaticFlowvsNonStaticFlow obi2=new StaticFlowvsNonStaticFlow();
		
		System.out.println("I am main "+dataStatic);
 
		System.out.println(obi.data);//we can't access instance data with out object reference
		obi.method1();
		System.out.println(obi.b);
		System.out.println(obi.dataStatic2);
		obi.dataStatic2="value changed";
		System.out.println(obi2.dataStatic2);
		
	
	}
	
	// methods 
	void method1() {
		System.out.println(dataStatic);// static data can be access any where 
		System.out.println(data+" "+data2);// we can access non static data in non static area without any limitations
	}

}
