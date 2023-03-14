package pradeep;

import java.util.Scanner;

public class CalculateTheNumberWithoutUsingMathpower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=sc.nextInt();
		System.out.println(" Enter a power:");
		int b=sc.nextInt();
		int c=1;
		for(int i=1;i<=b;i++) {
			c=c*a;
		}
		System.out.println(c);
	}

}
