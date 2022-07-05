package com.program.stringbuilder;

public class StringLimit {
	public static void main(String args[]) {
		doSomething();
	}
	public static void doSomething() {
		
		  //String s1 = "abcdefghijklmnopqrswuvxyz12345";//30
		String s1 = "abcd";
		  System.out.println("s1 length " + s1.length());
		  System.out.println("s1 value " + s1);
		  
		  String s2 = s1.substring(0, Math.min(20, s1.length())); //21
		  System.out.println("s2 length " + s2.length());
		  System.out.println("s2 value is  " + s2);
	
	}
}
