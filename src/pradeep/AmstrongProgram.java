package pradeep;

import java.util.Scanner;

public class AmstrongProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number whether it's amstrong number or not:");
		int copynum, digit, sum=0,count=0;
		int num=sc.nextInt();
	
	copynum=num;
	
	do 
	{
		digit=num%10;
		count++;
		num=num/10;
		
	}
	while(num!=0);
	num=copynum;
	do
	{
		digit=num%10;
		sum+=Math.pow(digit, count);
		num=num/10;
		
	}
	while(num!=0);
	if(sum==copynum)
	{
		System.out.println(copynum+" is an amstrong number.");
	}
	else
	{
		System.out.println(copynum+" is not amstrong number.");
	}

	}

}
