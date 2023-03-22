package pradeep;

import java.util.Scanner;

public class AddingTwoNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a First Number:");
		int num1=sc.nextInt();
		System.out.println(" Enter a Second Number:");
		int num2=sc.nextInt();
		int sum = num1*num2;
		System.out.println(" Addition of " +num1+" And"  +num2+" is:"+sum);
	}

}
