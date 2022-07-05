package com.test;

public class Test {

	public static void main(String[] arg) {
//		I1 i1 = new C1();
//		int sum = i1.sum(2, 5);
//		
//		System.out.println("Sum is : "+ sum);
		
		
		I1 i1 = (i, j) -> i+j;
		
		int sum = i1.sum(2, 5);
C1 c1 = (i, j,k) -> i+j+k;
		
		int sum1 = c1.sum(2, 5,6);
		
		System.out.println("Sum is : "+ sum);
		System.out.println("Sum is : "+ sum1);
		
		
	}
}
