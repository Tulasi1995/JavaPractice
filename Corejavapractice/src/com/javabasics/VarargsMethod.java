package com.javabasics;

/**
 * 
 * @author tulasiramg
 *
 */
public class VarargsMethod {
	
	// this class is used to test var arg  like optional parameters 
	
	void method1() {
		System.out.println("default method without args ");
	}
	 void method1(int ...i) {
		 int total=0;
		System.out.println("I am invoked here");
		
		for(int x:i) {
			total=total+x;
		}
		System.out.println("the total sum value is "+total);
	}
	 // we can not create method which accept int array when we have var args method 
	 void method1(int a[],int b[]) {
		 System.out.println(" method1 which accepts int array to call ");
	 }
	 void method2(int k,int ...j) {
		 // variable argument should be at last
		 //only one varargs is allowed per one method
		 System.out.println(" hello invoked parameterized varagrgs method");
		 System.out.println("varargs means variable arguments that may present or not present ");
	 }
	 
	static String method2(String ...tulasi) {
		 System.out.println(" cool it's invoked here String var args method ");
		 String returnString="";
		 for(String z:tulasi) {
			 returnString=returnString+z;
		 }
		 
		 return returnString;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if we want to accesss instance method then we must need a object reference 
		VarargsMethod varargsMethod=new VarargsMethod();
		varargsMethod.method1(1,2,3,4,5,6,7,8,9,10);
		String data=method2("tulasi","karthka");
		System.out.println(data);
		varargsMethod.method2(10,200,3,4,5,6,7,8,9);

	}

}
