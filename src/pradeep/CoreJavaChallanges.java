package pradeep;

import java.util.Scanner;

public class CoreJavaChallanges {

	public static void main(String[] args) {
		
	Scanner s1=new Scanner(System.in);
	System.out.println(" Enter a number: ");
	
	int x=s1.nextInt();
	if(x%2==0)
	{
	    System.out.println("Number is even");
	    if(x<=10)
	    {
	        System.out.println("Number is:"+x+"Hi");
	    }
	    else if(x>10 && x<20 )
	    {
	        System.out.println("Number is:"+x+"Hello");
	    }
	    else
	    {
	        System.out.println("Number is:"+x+"Bye");
	    }
	}
	else
	System.out.println("Number is Odd");
}
}
