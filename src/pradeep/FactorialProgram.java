package pradeep;

import java.util.Scanner;

public class FactorialProgram {

	private static int num;

	public static void main(String[] args) {
		int p=1;int fact = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a Number to get it's factorial:");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+a+" is:"+fact);
		
	}

}
