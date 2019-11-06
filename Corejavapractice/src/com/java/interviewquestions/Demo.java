package com.java.interviewquestions;
public class Demo {
                private static int i;
                static{
                                i =10;
                                System.out.println("Static Block");
                }
                public static void main(String args[]) {
                                i = i++;
                                System.out.println("Main Method : " + i);
                }
}

class sync{
	
	public synchronized void foo() {}
}
abstract class sync1{
	
	public synchronized void foo() {}
}
//interface sync3{
//	public synchronized void foo() {}
//}


