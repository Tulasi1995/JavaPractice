package com.javabasics.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatch {

	public static void main(String[] args) {

		
		try {
		System.out.println(10/2);
		throw new CustomException("You are custom");
		}finally {
			System.out.println("Without catch try will work");
		}
/*catch(Exception e){
	 catch block should be followed by try block but not finally finally block  it can be after catch or try block not before them
}*/
		
		// code in the try block should be as less as possible other wise it leads to abnormal termination if not handled carefully
		
//		try {
//     int k=10/0;
//     
//		}catch(NullPointerException fe) {
//			
//		}
//		//catch(FileNotFoundException fe) {
//		//} //why we are not able to use checked exceptions in try catch block
//		catch(Exception e) {}
//		
//	}

	}
}
