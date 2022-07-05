package com.program.stringbuilder;
import java.util.*;
public class StringProgram {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the string");
	 String s1 = sc.nextLine();
	
	 System.out.println("Enter the number");
	 int s = sc.nextInt();
	
	 System.out.println("Enter the decimal");
	 Double s2 = sc.nextDouble();
	 char[] chars = s1.toCharArray();

		
		for (char ch: chars) {
			System.out.print(ch);
		}
	 
	 
		
	 System.out.println(s);
		
	  System.out.println(s2);
}

}
