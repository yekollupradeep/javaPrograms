package com.qspider.BinarySearchTechquine;
import java.util.Scanner;
import java.util.Arrays;
public class BS {
	public static void main(String args[]){  
	    int arr[] = {50,100,150,200,250,300,35
	    		}; 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("The input array: " + Arrays.toString(arr));
	    System.out.println("Enter an element/key to be searched: ");
	    int key = sc.nextInt();
	    System.out.println("\nKey to be searched=" + key);
	    int first = 0;
	    int last=arr.length-1; 
	    
	    int mid = (first + last)/2;  //calculating the mid of the array
	    
	    while( first <= last )//while first index and last index do not overlap then only we will search
	    {  
	        
	        if ( arr[mid] < key )//if the midvalue < key, then key to be searched is in the first half of array
	        	{  
	            first = mid + 1;     
	        }
	        else if ( arr[mid] == key )//if key is equal to element at mid, then print the location
	        {  
	            System.out.println("Element is found at index: " + mid);  
	            break;  
	        }
	        else
	        {  
	            //the key has to be searched in the second half of the array
	            last = mid - 1;  
	        }  
	        mid = (first + last)/2;  
	   }  
	   //Suppose, if first and last overlap, then key is not present in the array
	   if ( first > last )
	   {  
	      System.out.println("Try Again!Element is not found!");  
	   }       
	 }  
	} 


