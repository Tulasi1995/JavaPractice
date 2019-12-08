package com.javabasics;

import java.util.Scanner;

public class SampleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helo");
		System.out.println("please enter a number ");
		Scanner s=new Scanner(System.in);
		int i=0;
		try {
		   i=s.nextInt();
		}catch(Exception e) {
			System.out.println("please enter only number ");
			 i=s.nextInt();
		}finally {
			s.close();
		}
       System.out.println(number(i));
       System.out.println("done");
	}

	static int number(int n) {

		String number = String.valueOf(n);
		char[] c = number.toCharArray();
		StringBuilder opt = new StringBuilder();
		for (char c1 : c) {

			switch (c1) {

			case '0':
				opt.append('9');
				break;
			case '1':
				opt.append('8');
				break;
			case '2':
				opt.append('7');
				break;
			case '3':
				opt.append('6');
				break;
			case '4':
				opt.append('5');
				break;
			case '5':
				opt.append('4');
				break;
			case '6':
				opt.append('3');
				break;
			case '7':
				opt.append('2');
				break;
			case '8':
				opt.append('1');
				break;
			case '9':
				opt.append('0');
				break;
			default:
				break;
			}
		}
          String out=opt.toString();
		return Integer.parseInt(out);
	}

}
