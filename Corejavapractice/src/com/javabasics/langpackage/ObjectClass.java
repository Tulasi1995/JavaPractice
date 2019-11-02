package com.javabasics.langpackage;

public class ObjectClass  implements Cloneable{
	
	int id;
	
	public String toString() {
		
		return "class"+id; 
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ObjectClass obj=new ObjectClass();
		ObjectClass obj2=new ObjectClass();
		System.out.println(obj.toString());
		System.out.println("-----");
		System.out.println(obj.getClass().getName());
		System.out.println(" printing hash code of onject based on it's reference ");
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj2));
		ObjectClass obj3=(ObjectClass)obj2.clone();
		
		System.err.println(obj3.equals(obj2));
		
		int j=1;
		for(int i=j;i<=10;i++) {
			
		}

	}

}
