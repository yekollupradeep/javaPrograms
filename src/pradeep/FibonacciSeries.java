package pradeep;

import java.util.Scanner;

public class FibonacciSeries {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a no. of elements to de displayed for fibancci sreies:");
	int	n=sc.nextInt();
	int a=0;
	int b=1;
	int sum;
	System.out.print(a+",");
	System.out.print(b+",");
	for ( int i=3;i<=n;i++)
	{
		sum=a+b;
		
		if(i<n)
		{
			System.out.print(sum+" ,");
		}
		else {
			System.out.print(sum+".");
		}
		a=b;
		b=sum;
		
		
	}

	}

}
 