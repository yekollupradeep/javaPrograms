package com.qspider.ObjetProgram;

public class PG {
public static void main(String[] args) {
	PG p1= new PG();
	PG p2= new PG();
	int h1=p1.hashCode();
	int h2=p2.hashCode();
	System.out.println(p1==p2);
	System.out.println(p1.equals(p2));
	System.out.println(h1==h2);
	
}
}
