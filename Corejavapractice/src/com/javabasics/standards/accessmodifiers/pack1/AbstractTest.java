package com.javabasics.standards.accessmodifiers.pack1;

public class AbstractTest extends AbstractModifier {

	@Override
	void tulasi() {
		// TODO Auto-generated method stub

	}

	@Override
	void tulasi1() {
		// TODO Auto-generated method stub

	}

	
	static strictfp void tulasi2(String data) {
		// TODO Auto-generated method stub
System.out.println(10/3);
	}
	//AbstractModifier obj1=new AbstractModifier(); we can not create object for abstract class 
	//AbstactTest2 obj2=new AbstactTest2();
	// even though we don't have any abstract methods we can't declare object for that class 

 public static void main(String[] args) {
	tulasi2("baby");
}

@Override
void tulasi2() {
	// TODO Auto-generated method stub
	
}
}
