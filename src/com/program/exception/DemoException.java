package com.program.exception;

public class DemoException {
public static void main(String[] args) {
	 int i,j,k=0;
	 i=8;
	 j=2;
	 try {
		 k=i/j;
		 
	 }
	 catch(Exception e)
	 {
		System.err.println("can't divide by zero");
	 }
	 System.out.println(k);
	}
}

