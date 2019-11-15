package com.javabasics.multithread;

public class ThreadMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Childthread c = new Childthread("c");
		Childthread c1 = new Childthread("c1");
		Childthread c2 = new Childthread("c2");
		
		c.start();
		c1.start();
		c2.start();
		//c.join();
		//c1.join();
		// c.join();
		// c.interrupt();
		//System.out.println("Count value is " + Childthread.count);

	}
}

class Childthread extends Thread {

	Childthread(String name){
		super(name);
	}
	static int count = 0;

	public void run() {

		m1();

	}

	 void m1() {
		
		for (int i = 0; i < 10; i++) {
			// System.out.println(" Child Thread ");
			count = count + 1;
			Thread.currentThread().getName();
			System.out.println(Thread.currentThread().getName()+ " "+i);

		}

	}

}
