package com.qspider.StringPrograms;
/*
 SWAP 2  NUMBERS WITHOUT USING THIRD VARIABLE.
 
 */
public class SwapTwonumbersWithoutThird {
	public static void main(String[] args) {
		int a=25;
		int b=35;
		System.out.println("first number before swap: "+a);
		System.out.println("second number before swap: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println();
		System.out.println("first number after swap: "+a);
		System.out.println("second number after swap: "+b);
		
		
	}

}
