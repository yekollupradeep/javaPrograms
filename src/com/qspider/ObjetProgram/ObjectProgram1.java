package com.qspider.ObjetProgram;

public class ObjectProgram1 {
	String eName;
	int eId;
	double salary;
	ObjectProgram1(String eName,int eId, double salary)
	{
		this.eName=eName;
		this.eId=eId;
		this.salary=salary;
	}
	
	

	

	public String toString() {
		return "eName=" + eName + ", eId=" + eId + ", salary=" + salary;
	}





	public static void main(String[] args) {
		ObjectProgram1 e1=new ObjectProgram1("Pradeep",21,12345);
		ObjectProgram1 e2=new ObjectProgram1("Santhosh",22,654321);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}
	
	
		
	}
	


