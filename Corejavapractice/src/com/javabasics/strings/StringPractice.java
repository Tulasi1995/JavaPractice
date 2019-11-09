package com.javabasics.strings;

/**
 * 
 * @author G Tulasi Ram
 *
 */
public class StringPractice {

	/**
	 * 
	 * @param args
	 */
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		char []ch= {'t','u','l','a','s','i'};
		
		String s=new String(ch);// this as same as below statement
		String s1="Tulasi";
		String s2=new String("Tulasi");
		String s3="Infosys";
		System.out.println(s+ " == "+s1);
		
		//String method practice 
		System.out.println("getting char at index 3 which is a here == "+s.charAt(3));
		
		System.out.println("the length of String can be get by using length method os string class  here is the length is 6 == "+s.length());
		
		System.out.println(" if you want to know the  UNICode of chracter in the string just give that index "+s.codePointAt(5));
		
		System.out.println("code point before the defined index "+s.codePointBefore(6));
		// string comparison by equal method
		System.out.println(s1.equals(s)); //false because T and t 
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s)); // true ignore capital and small letters  in this case it will convert that
		// string to CAPITAL letters and small letters it will check both the conditions then only it will return true or false 
		
		// string comparison by == operator 
		
		System.out.println(s1==s2); // false because reference is different but content is same 
		
		// string comparison with compareTo method 
		System.out.println(s1.compareTo(s2)); // true // o 
		System.out.println(s1.compareTo(s3));   // 11 negative vaue 
		
		String concat=" Tulasi "+" Ram ";
		// when we run the above line compiler will convert that code into like below 
		// new StringBuilder().append("Tulasi").append("Ram");
	
		System.out.println(concat);
		//concatenation using concat method
		String concatResult=concat.concat(" G");
		System.out.println(concatResult);
		// in all the cases new String literal is created in String pool memory and that reference is provided to variables
		String sub="Tulasi Ram Gonuguntal";
	 //subString two methods start index and end index we have to provide 
		System.out.println(sub.substring(7)); // only starting index to end of String 
		System.out.println(sub.substring(0, 6)); // both the value we have to provide  start index end end index
		System.out.println(concat.toLowerCase()); //tulasiram in lower case
		System.out.println(concat.toUpperCase()); // TULASIRAM in upper case
		System.out.println(concat.trim()); // trim method will remove spacess 
		
		String date="12-Nov-2019";
		String date1[]=date.split("-") ;
		for(String st:date1) {
			System.out.println(st);
		}
		

	}

}
