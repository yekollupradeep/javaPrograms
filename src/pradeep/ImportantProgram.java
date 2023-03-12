package pradeep;

import java.util.Scanner;

public class ImportantProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int age = sc.nextInt();
		String city = sc.next();
		long phNo = sc.nextLong();
	   Employee e = new Employee(s, city, age, phNo);
	   long phNo1=sc.nextLong();
	   if(phNo1==phNo) {
		   System.out.println("This details is already in database \n the details are");
		   System.out.println("The Employee Name is"+e.getEmpName());
		   System.out.println("The employee age is "+e.getAge());
		   System.out.println("The employee number is "+e.getPhNo());
		   System.out.println("the Employee city is"+e.getCity());
	   }else {
		   System.out.println("This employee details is not there in database");
	   }
	}

}
