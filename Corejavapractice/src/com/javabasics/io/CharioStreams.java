package com.javabasics.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author G Tulasi ram
 *
 */
public class CharioStreams {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String path="/Users/tulasiramg/git/tulasiramG/Corejavapractice/src/com/javabasics/io/";
		
		// char input sreams reads characters 
		// byte streams are very low level 
		// these classes are starts with Reader and writer 
		try(FileReader fr=new FileReader(path+"tulasi.txt");FileWriter fw=new FileWriter(path+"charFile.txt");) {
			
			int ch;
			
			while( (ch=fr.read())!= -1) {
				
				fw.write(ch);
			}
			
			fr.close(); // it's best practice to close the streams in Finally block to avoid resource/memory leaks 
			fw.close();
		}
		System.out.println("done");

	}

}
