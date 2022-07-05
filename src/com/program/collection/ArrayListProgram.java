package com.program.collection;

import java.util.ArrayList;

public class ArrayListProgram {
public static void main(String[] args) {
	ArrayList <String>a1 = new ArrayList();
	a1.add("shashidhar");
	a1.add("reddy");
	a1.add(2,"Hii");
	for (String s1 :a1)
	System.out.println(s1);
	System.out.println(a1.contains("Hii"));
	
}
}
