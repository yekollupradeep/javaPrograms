package com.qspider.StringsPrograms26;
import java.util.Scanner;
public class TestcharAt {
	public static void main(String[] args) {
		String s="Pandu";
		Scanner sc=new Scanner(System.in);
		System.out.println("Given String:"+s);
		System.out.println("Enter a the index values:");
		int index=sc.nextInt();
		char ch=s.charAt(index);
		System.out.println("character present at index "+index+ " is:"+ch);
		
	}

}