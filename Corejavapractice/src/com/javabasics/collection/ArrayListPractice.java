package com.javabasics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args) {
    
		
		// Iterable  Collection   AnstractList List   ArrayList
		 ArrayList<Comparable> a=new ArrayList<Comparable>(); // non generic 
		 
		 a.add(10);
		 a.add("Tulasi");
		 a.add(10.0f);
		 a.add(100.00d);
		 a.add('c');
		 
		 System.out.println(a); // if we print the object  then we get content in that not hashcode  
		 //because toString method is overidden
		 // non generic is not prefereable at the time of retrival we have to  know the type in advance to avoid type casting error 
		 // which is may not posiible always 
		 
		 
		 ArrayList<String> al=new ArrayList<String>();
		 ArrayList<String> al2=new ArrayList<String>();
		 
		 for(int i=0;i<10;i++)
			 al.add("Tulasi "+i);
		 
		 for(int i=10;i>0;i--)
			 al2.add("Tulasi "+i);
		 
		 System.out.println(al.toString()); // toString 
		 
		 //add all method
		 al.addAll(al2);
		 
		 al.retainAll(al2);
		 System.out.println("retaining "+al);
		// System.out.println(al);
     
		 // iterating ArrayList items through  foreach loop first 
		 
		/* for(String s:al) {
			 //System.out.print(s);
		 }
		 */
		 // iterating with  Iterator object
		 
		/*Iterator<String> il= al.iterator();
		
	     while(il.hasNext()) {
	    	 
	    	// System.out.println(il.next());
	    	// il.remove();
	     }*/
	     
	     // List Iterator
	     
	     ListIterator<String> li=al.listIterator();
	     
	     while(li.hasNext()) {
	    	 System.out.println(li.next());
	    	 //li.hasPrevious();
	    	 //li.previous();
	    	 //li.add("tulasi k");
	     }
	     
	     System.out.println("done");
	    // System.out.println(al);
	     
	     // iterating over for each loop
	     al.clear();
	     al.forEach(System.out::print); // method reference
	     
	     //al.stream().map((s)->s.equals("Tulasi 6"));
		
	}

}
