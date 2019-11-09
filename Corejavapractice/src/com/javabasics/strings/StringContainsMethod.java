package com.javabasics.strings;

/**
 * 
 * @author G Tulasi Ram
 *
 */
public class StringContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="tulasi";
		boolean b=StringContainsMethod.contains(s1, 'g');
		System.out.println(b);

	}
	
	static boolean contains(String s,char value) {
		
		 int n=s.length();
		 
		 for(int i=0;i<n;i++) {
			    char c=s.charAt(i);
			    if(c==value) {
			    	return true;
			    }
			 
		 }
		
		return false;
	}

}
