package pradeep;

import java.util.Scanner;

public class ArrayEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int a[]=new int[num];
		for(int i=1;i<num;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a[i]+ " is prime number");
			}
		}

	}

}
