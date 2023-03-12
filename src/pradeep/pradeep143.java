package pradeep;

import java.util.Scanner;

public class pradeep143 { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0&&i%3==0)
			{
				System.out.println(i+"Good Morning");
				
				if(i%3==0&&i%4==0)
				{
					System.out.println(i+"Good Afternoon");
				}
				if(i%5==0&&i%6==0)
				{
					System.out.println(i+"Good Night");
				}
			}
		}
	}

}
