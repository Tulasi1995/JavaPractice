package com.javabasics.multithread;

public class ThreadPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//System.out.println("main method");
		//t.start();
		//t.sleep(2000);
		
		//System.out.println(" I just wake up ");
		Test2 test2= new Test2("tulasi");
		//Test2 test3= new Test2();
		
        test2.start();
        test2.setPriority(10);
       // test2.start();// thread is already started 
       // test2.run();
       // test3.start();
        Test test= new Test();
		Thread t =new Thread(test);
        System.out.println("Name of thread "+test2.getName());
        System.out.println("Name of thread "+t.getName());
        
       // test2.increment();
        //test3.increment();
        
        //System.out.println(test2.count);
        
        for(int i=0;i<10;i++) {
			System.out.println(" main thread");
		}
        
       // test2.start();
        
        Thread t3= new Thread( () ->  {
        	 System.out.println(" Thread three with lambda expressions");
        } );
        
        t3.start();
	}

}

class Test implements Runnable {

	@Override
	public void run() {
		
		System.out.println(" child thread is runing ");
		
	}
	
	
	
	
}

class Test2 extends Thread {
	
	
	public void run() {
		 
		 for(int i=0;i<10;i++) {
			 Thread.yield();
			 // yield method will provide chance to other threads of same priority 
				System.out.println(" child thread class");
			}
		
	}
	Test2(String name){
		
		super(name);
	}
	
	int count=0;
	void increment() {
		
		
		for(int i=0;i<10;i++) {
			count=count+1;System.out.println("hey");
		}
	}
	
}
