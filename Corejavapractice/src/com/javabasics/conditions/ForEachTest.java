package com.javabasics.conditions;

public class ForEachTest {
	
	static void doWhile() {
		int j=2;
		do {
			System.out.println("I am do while I will execute at least once irrectpective of conditoin");
			j++;
		}while(j<10);
	}
	
	static void forLoop() {
		for(int i=0;i<20;i++)
		System.out.println(" from for loop 20 times ");
	}
	static void whileLoop() {
		int i=0;
		 while(i<=10) {
			 System.out.println(" this is printing from while loop"+i);
			 i++;
		 }
	}
	
	static void forEachLoop() {
		
		int []a= {1,2,3,4,5,6,7,8,9,10};
		int index=0;
		for(int j:a) {
			System.out.println(" from foreach loop difficult yto track the index"+j);
			System.out.println(" value at index "+index+" is "+a[index]);
			index+=1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int []a= {10,20,30,40,50,10,1,90,2,3,3,4,5,5,6,7,8,8};
		
		for(int i:a) {
			
			System.out.println("element at index is "+i);
			System.err.println("we can not get index in foreach loop");
		}*/
		/*int x=0;
		do {
			++x;
			System.out.println(x);
			if(++x<5)
				continue;
			++x;
			System.out.println(x);
		}while(++x<10);

	}*/
		
		doWhile();
		forLoop();
		whileLoop();
		forEachLoop();
		// while loop 
		
		
		 
		
		
		
		
	}

}
