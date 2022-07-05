package com.program.exception;

import java.util.Iterator;

public class MultiCatch {
public static void main(String[] args) {
	int i ,k,h=0;
	i=8;
	 k=0;
	 try {
		int  k1=i/h;
		
			
	
	 }
	 catch(ArithmeticException e)
	 {
		System.err.println("can't divide by zero");
	 }
	 
	 catch (IndexOutOfBoundsException e)
	 {
		 System.err.println("indexofBoundsException" );
		 
	 }
	 finally {
		System.out.println("Finnaly block");
	}
	 
	}

}

