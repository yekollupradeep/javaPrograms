package com.qspider.ObjetProgram;

public class Objectprogram2 {
	String empName;
	int eId;
	static int newempId=2900;
	Objectprogram2(String empName)
	{
		this.empName=empName;
		this.eId=hashCode();
	}
	public int hashCode() {
		// TODO Auto-generated method stub
		return ++newempId;
	}
	public String toString() {
		return "empName=" + empName + ", eId=" + eId;
			
	}
	public static void main(String[] args) {
		{
			Objectprogram2 p1=new Objectprogram2("Pradeep");
			Objectprogram2 p2=new Objectprogram2("santhosh");
			Objectprogram2 p3=new Objectprogram2("Anjani");
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			System.out.println(p3.toString());
	}
	
	
	
	
	
		
		
	}
	
	
	
	

}
