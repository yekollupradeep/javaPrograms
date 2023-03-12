package ArraysPrograms;

import java.util.Scanner;

public class SimpleProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a The Size Of Array:");
		int size=sc.nextInt();
		int [] array=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println(" Enter the elements:");
			array [i]=sc.nextInt();
		}
		sc.close();
		System.out.println(" printing the elements in the array:");
		for( int i=0; i<array.length;i++) {
		System.out.println(array[i]);	
		}

	}

}
