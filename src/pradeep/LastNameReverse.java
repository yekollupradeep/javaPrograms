package pradeep;

import java.util.Scanner;

public class LastNameReverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a sentence to get last name reverse:");
		String s= sc.nextLine();
				
		
		String rev = "";
for (int i=s.length()-1; i>=0; i--)
{
	if(i>s.length()/2)
	{
		rev=rev+s.charAt(i);
	}
	else
	{
	rev=s.charAt(i)+rev;
	}

	
	}
System.out.println(rev);
}
}



			
		
		
	

