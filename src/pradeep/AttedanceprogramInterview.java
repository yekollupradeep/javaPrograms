package pradeep;

import java.util.Arrays;
import java.util.Scanner;

public class AttedanceprogramInterview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		String students[]= new String[length];
		System.out.println("Enter the students");
		for(int i=0;i<length;i++) {
			students[i]=sc.next();
		}
		System.out.println(Arrays.toString(students));
		String stu1=sc.next();
		for(int i=0;i<length;i++) {
			if(stu1.equals(students[i])) {
				System.out.println(stu1+"is already came and attedance have been taken.");
				break;
			}else {
				System.out.println(stu1+" is not there in database and Attedance have not been taken.");
				break;
			}
		}
//		System.out.println("Tarun sir is searching for student");
//		String stuName = sc.next();
//		int str=0;
//		for(int i=0;i<students.length;i++) {
//			if(stuName.equals(students[i])) {
//				System.out.println("the student"+stuName+" is studying in qspiders");
//				str++;
//				break;
//			}
//		}
//		if(str==0) {
//			System.out.println("The student"+stuName+" is not studying in qspiders");
//		}
	}

}
