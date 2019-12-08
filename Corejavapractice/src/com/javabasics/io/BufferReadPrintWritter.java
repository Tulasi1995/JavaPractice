package com.javabasics.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * 
 * @author G Tulasi ram
 *
 */
public class BufferReadPrintWritter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // this class BufferReader and printWritter is used to write /read one line at a Time the line feed /n carriage return /rare used internally  
		 //BufferedReader br=null;
		// PrintWriter pwr=null;
		 String path="/Users/tulasiramg/git/tulasiramG/Corejavapractice/src/com/javabasics/io/";
    try(BufferedReader br=new BufferedReader(new FileReader(path+"tulasi.txt")); PrintWriter pwr= new PrintWriter(new FileWriter(path+"stringread.txt"));) {
    	   
    	   // br=new BufferedReader(new FileReader(path+"tulasi.txt")); // bufferreader takes FileReader as an argument
    	  //  pwr= new PrintWriter(new FileWriter(path+"stringread.txt"));// printWritter takes Writter as an argument
    	    
    	    String s;
    	    
    	    while( (s=br.readLine()) != null) {
    	    	
    	    	pwr.println(s);
    	    }
    	   
       }catch(Exception e) {
    	   
       }
       System.out.println("done");
	}

}
