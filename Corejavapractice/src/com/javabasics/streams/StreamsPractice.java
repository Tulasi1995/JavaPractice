package com.javabasics.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author TulasiRam G
 *
 */
public class StreamsPractice {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Mobile m1=new Mobile(1,"Apple",100000.0);
		Mobile m2=new Mobile(1,"Google",50000.0);
		Mobile m3=new Mobile(1,"JIo",50000.0);
		Mobile m4=new Mobile(1,"Airtel",2000.0);
		Mobile m5=new Mobile(1,"Idea",100000.0);
		Mobile m6=new Mobile(1,"Nokia",50000.0);
		Mobile m7=new Mobile(1,"Vodaphoe",2000.0);
		Mobile m8=new Mobile(1,"Samsung",50000.0);
		Mobile m9=new Mobile(1,"LG",30000.0);
		
		List<Mobile> mobileList=new ArrayList<Mobile>();
		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		mobileList.add(m5);
		mobileList.add(m6);
		mobileList.add(m7);
		mobileList.add(m8);
		mobileList.add(m9);
		
		mobileList.stream().filter(p->p.price>50000).map(p->p.name).forEach(System.out::println);
		mobileList.stream().filter(p->p.name=="Apple").map(p->p.price).forEach(System.out::println);
		
	}
	
	

}

class Mobile{
	
	int id;
	String name;
	Double price;
	
	Mobile(int id,String name,Double price){
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}
