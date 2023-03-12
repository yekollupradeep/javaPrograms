package pradeep;

import java.util.Scanner;

public class JavaProgramTables {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.println(" Enter a Number Show It's Table:");
int a=sc.nextInt();
 for ( int i=1; i<=10; i++)
 {
	 System.out.println(a+"x"+i+"="+(a*i)+"");
 }

	}

}
