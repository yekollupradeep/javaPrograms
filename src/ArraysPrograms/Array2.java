package ArraysPrograms;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a 10 names:");
	     String sName[]= new String[10];
	     for(int i=0;i<10;i++) {
	    	 sName[i]=sc.nextLine();
	     }
	     System.out.println(" The Names Are:");
	     for(int i=0;i<10;i++) {
	    	 System.out.println(sName[i]);
	     }
	    
	   
	    }
	}


