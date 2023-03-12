package com.qspider.LinearSearchTechquine;
/*
 WAP TO ENTER A STRING AND THE REVERSE THE STRING AND COUNT THE STRING IS 
 HOW MANY TIMES IS REPEATED.
 */
import java.util.Scanner;
public class program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50,10,20,50,40};
		int count=0;
		System.out.println("Elements are present in the array:");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
		int searchprogram1=sc.nextInt();
		for(int i=0;i<arr.length;i++)
			if (arr[i]==searchprogram1) {
				count++;
			}
		if(count>0) {
			System.out.println(searchprogram1+" is present in array");
		}
		else {
			System.out.println(searchprogram1+" is present in array");
			
		}
		System.out.println("the no.of elements in array:"+count);
		
			
			
			
			
			
		
			
		
		
	}
	
	
	}


