package ArraysPrograms;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("giving the size of array");
	    
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    System.out.println(" Enter a numbers:");
	    for(int i=0;i<size;i++) {
	    	a[i]=sc.nextInt();
	    }
	    int sum=0;
	    int product = 1;
	    
	    for(int i=0;i<a.length;i++) {
	    	sum+=a[i];
	    	product*=a[i];
	    }
        System.out.println("The average of the elements:"+(sum/a.length));
        System.out.println("The sum of elements in an array:"+sum);
        System.out.println("The product of elements in an array:"+product);
	}

}
