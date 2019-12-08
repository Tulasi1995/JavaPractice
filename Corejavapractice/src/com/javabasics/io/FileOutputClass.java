package com.javabasics.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author G Tulasi ram
 *
 */
public class FileOutputClass {
	
	public native int m1(String s); 

	public static void main(String[] args) throws IOException{

		String path="/Users/tulasiramg/git/tulasiramG/Corejavapractice/src/com/javabasics/io/";
		FileInputStream in = null;
		FileOutputStream out= null;
		try
		{
			 in = new FileInputStream(path+"tulasi.txt"); 
			 out= new FileOutputStream(path+"tulasiOut.txt");
			int i;
			while((i=in.read())!=-1) {
				out.write(i);
			}
		}finally {
			if(in !=null)
				in.close();
			if(out !=null)
				out.close();
		}
		
		System.out.println("done");
		 
		
		
	}

}
