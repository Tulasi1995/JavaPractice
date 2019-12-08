package com.javabasics.strings;

import java.util.HashMap;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello";
		String s1=new String("Hello baby");
		String s2=s1.intern();
		//String s3="Hello baby";
		
		System.out.println(s2.equals(s1));
		System.out.println("done");
		
		// calculate no of occurence in given word 
		
		 String work="HeyTulasiramramaraogonuguntla";
		 char []c=work.toCharArray();
		 
		 HashMap<Character,Integer> occurence=new HashMap<Character,Integer>();
		 
		 for(char c1:c) {
			 
			 if(occurence.containsKey(c1)) {
				 occurence.put(c1, occurence.get(c1)+1);
			 }else {
				 occurence.put(c1,1);	 
			 }
		 }
		 
		 System.out.println(occurence);
		 
		 String sub="TulasiRam";
		 System.out.println(sub.substring(5));
		 System.out.println(sub.substring(1, 9));
		 String reverseString = recursiveSwap(sub);
         
	        System.out.println(reverseString);
	    }
	     
	    static String recursiveSwap(String str)
	    {
	         if ((null == str) || (str.length() <= 1))
	         {
	                return str;
	         }
	         return recursiveSwap(str.substring(1)) + str.charAt(0);
	    }

}
