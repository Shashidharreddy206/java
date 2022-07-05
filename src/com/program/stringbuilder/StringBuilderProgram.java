package com.program.stringbuilder;
import java.util.*;
public class StringBuilderProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder  s1 = new StringBuilder();
		
		System.out.println(s1.append("shashi"));
		System.out.println(s1.capacity());
		System.out.println(s1.charAt(1));
		System.out.println(s1.toString());
		System.out.println(s1.codePointAt(2));
		System.out.println(s1.reverse());
		System.out.println(s1.subSequence(1, 5));
		
		
		System.out.println( s1.delete(1, 8));
		
	}

}
