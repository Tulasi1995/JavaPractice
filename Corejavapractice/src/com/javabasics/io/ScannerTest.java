package com.javabasics.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
                Scanner s=null;
                String path="/Users/tulasiramg/git/tulasiramG/Corejavapractice/src/com/javabasics/io/";
                try {
                	s= new Scanner(new BufferedReader(new FileReader(path+"tulasi.txt")));
                	
                	while(s.hasNext()) {
                		System.out.println(s.nextLine());
                	}
                }catch(Exception e) {
                	
                }
                finally {
                	s.close();
                }
                
                System.out.println("done");
	}

}
