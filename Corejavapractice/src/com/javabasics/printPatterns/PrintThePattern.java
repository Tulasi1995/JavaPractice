package com.javabasics.printPatterns;

import java.util.Scanner;

/**
 * 
 * @author tulasiramg
 *
 */
public class PrintThePattern {
	
	/**
	 *   print  * 
	 *          **
	 *          ***
	 *          *****
	 * 
	 */
	static void stepsPattersn() {
		
		//with for loop
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println(" now print the starts with while loop");
		// while loop
		int i=0;
		while(i<5) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
			
		}
		 System.out.println(" now with do while loop ");
		 int k=0;
		 do {
			 
			 int m=0;
			 while(m<=k) {
			 System.out.print("*");
			 m++;
			 }
			 System.out.println("");
			 k++;
			 
		 }while(k<5);
		 
		 System.out.println(" now with enhanced for loop formelrly known as for each loop");
		 
		 int []a= {1,2,3,4,5};
		 int index=a.length;
		 for(int s:a) {
			 
			 for(int l:a) {
			 System.out.print("*");
			 }
			 System.out.println("");
		 }
		// with we can't do it with only for each loop
		 
	}
   
	/**
	 * print pyramid pattern
     *       *
     *      * *
     *     * * *
     *    * * * *
     *   * * * * *   
     */
	static void pyramidPattern() {
		
System.out.println("pyramid program with for loop");	

for(int i=0;i<6;i++) {
	// for printing space
	for(int j=6-i;j>1;j--)
	System.out.print(" ");
	// print the star
	for(int m=0;m<i;m++)
		System.out.print("* ");
	
	System.out.println(" ");
}

// pyramid program with while loop
System.out.println("pyramid program with while loop");
 int l=0;
  while(l<6) {
	  // printing space
	  int k=6-l;
	  while(k>1) {
		  System.out.print(" ");
		  k--;
	  }
	  int m=0;
	  while(m<l) {
		  System.out.print("* ");
		  m++;
	  }
	  
	  System.out.println(" ");
	  l++;
  }
  
  // pyramid program with do while loop
  System.out.println("pyramid program with do while loop");
  
    int d=0;
  do {
	  // printing space
	  int e=6-d;
     while(e>1) {
    	 System.out.print(" ");
    	 e--;
    	 
     }
     int f=0;
     while(f<d) {
    	 System.out.print("* ");
    	 f++;
     }
	  System.out.println("");
	  d++;
	}while(d<6);
  
  
	}
  
	/**
	 * Diamond Pattern
	 * 
	 */
	static void diamondPattern() {
		
		int n, i, j, space = 1;
		System.out.print("Enter the number of rows: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		space = n - 1;
		for (j = 1; j<= n; j++)
		{
		for (i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space--;
		for (i = 1; i <= 2 * j - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		
		
		space = 1;
		for (j = 1; j<= n - 1; j++)
		{
		for (i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space++;
		for (i = 1; i<= 2 * (n - j) - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		
		
		
	}
	public static void main(String[] args) {

		//stepsPattersn();
		//pyramidPattern();
		diamondPattern();
	}
	

}
