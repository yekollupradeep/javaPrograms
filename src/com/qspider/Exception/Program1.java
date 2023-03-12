package com.qspider.Exception;
import java.util.Scanner;
public class Program1 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("enter the value of A");
		int a=sc.nextInt();
		System.out.println("Enter the value of B");
		int b=sc.nextInt();
	
		try {
			int c=a/b;
			
		}
		catch (Exception e) {
			System.out.println("kindly don't enter 0");
			
			
		}
		
		
		
			
		
		
	}

}
