package com.qspider.BinarySearchTechquine;
import java.util.Scanner;
public class BinarySearch {
	 public static void main(String arg[])
	    {
	        int n[]={1,4,6,7,8,9,10,11,14,15,16};
	        int low, high, mid, p=0, l, i, m, f=0;
	        l=n.length;
	        low=0;
	        high=l;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter number to search:");
	        m=sc.nextInt();
	        while(low<=high)
	        {
	            
	            mid=(low+high)/2;
	            if(m<n[mid])
	             high=mid-1;
	            else if(m>n[mid])
	             low=mid+1;
	            else if(m==n[mid])
	            {
	                f=1;
	                p=mid+1;
	                break;
	                
	            }
	        }
	        if(f==1)
	        {
	            System.out.println(m+" is located at "+p);
	        }
	        else
	        {
	            System.out.println(m+" is not found");
	        }
	    }
	     
	}



