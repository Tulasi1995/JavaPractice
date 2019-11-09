package com.javabasics.strings;

/**
 * 
 * @author G Tulasi Ram
 *
 */
public class StringVsStringBuffer {

	
	void stringConcatenation() {
		String s="Tulasi";
		
		for(int i=0;i<1000;i++) {
			s=s+i;
		}
		
	}
	 void stringBufferConcat() {
		 
		 StringBuffer s=new StringBuffer("Tulasi");
		 for(int i=0;i<1000;i++) {
				s=s.append(i);
			}
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringVsStringBuffer strTest= new StringVsStringBuffer();
		
		System.out.println("Calling String Concat and Time is "+System.currentTimeMillis());
		strTest.stringConcatenation();
		System.out.println("Done String Concat and Time is "+System.currentTimeMillis());
		System.out.println("Calling StringBuffer Concat and Time is "+System.currentTimeMillis());
		strTest.stringBufferConcat();
		System.out.println("Done StringBuffer Concat and Time is "+System.currentTimeMillis());
		
// seams like StringBuffer is fast but it takes more memory which is not good
	}

}
