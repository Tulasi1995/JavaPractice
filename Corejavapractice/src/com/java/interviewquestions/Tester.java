package com.java.interviewquestions;

class Beta{}

class Alpha{
	
	static Beta b1;
	Beta b2;
}
/**
 * 
 * @author tulasiramg
 *
 *Q: How many objects ate available for garbage collection at the end of line 30 
 * Answer : created 4 objects and 3 object deleted so 3 objects are available for garbage collection
 */
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Beta b1=new Beta();
       Beta b2=new Beta();
       Alpha a1=new Alpha();
       Alpha a2=new Alpha();
       
       a1.b1=b1;
       a1.b2=b1;
       a2.b2=b2;
       a1=null;
       b1=null;
       b2=null;
System.out.println(" Done ");
       
	}

}
