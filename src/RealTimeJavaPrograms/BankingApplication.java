package RealTimeJavaPrograms;

import java.util.Scanner;

public class BankingApplication {
	

	public static void main(String[] args) {
BankAccount obj=new BankAccount(" SL DevCode", "SL00001");
obj.showMenu();

	}

}
class  BankAccount{
	int balanace;
	int previousTranasaction;
	String customerName;
	String customerId;
	
	 BankAccount(String cname, String cid)
		 {
		 customerName=cname;
		 customerId=cid;
		 
		 }
	 
		 
	
	
	void deposit(int amount) {
		if ( amount!=0) {
			balanace= balanace+amount;
			previousTranasaction= amount;
		}
	}
	void withdraw(int amount) {
		if ( amount!=0) {
			balanace= balanace-amount;
			previousTranasaction= -amount;
		}
		
	}
	void getPrevioustranasaction() {
		if(previousTranasaction>0) {
			System.out.println("Deposited:"+ previousTranasaction);
		}
		else if(previousTranasaction<0) {
			System.out.println(" WithDraw:"+ Math.abs(previousTranasaction));
		}
		else {
			System.out.println("No Transaction Occured");
		}
	}
	void showMenu() {
		char option='\0';
		
		System.out.println(" Welcome:"+customerName);
		System.out.println(" yourId:"+customerId);
		System.out.println("\n");
		System.out.println("A: Check Your Balance");
		System.out.println("B: Deposit");
		System.out.println(" C: WithDraw");
		System.out.println(" D: previous Transaction");
		System.out.println(" E: Exit the system ");
		
		do {
			 Scanner sc = new Scanner(System.in);
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println(" Enter your option");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			option =sc.next().charAt(0);
			System.out.println("\n");
			
			switch (option) {
			
			case 'A':
				System.out.println("-------------------------------------");
				System.out.println(" Balance="+balanace);
				System.out.println("=================================================");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("-------------------------------------");
				System.out.println(" Enter a Amount To Deposit");
				System.out.println("=================================================");
				
				int amount=  sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				
				break;
				
			case 'C':
				System.out.println("-------------------------------------");
				System.out.println(" Enter a Amount To Deposit");
				System.out.println("=================================================");
				
				int amount2=  sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				
				break;
				
			case 'D':
				System.out.println("--------------------------------------------------");
				getPrevioustranasaction();
				System.out.println("=========================================================");
				System.out.println("\n");
				break;
				
			case 'E':
			System.out.println("====================================================================================");
			break;
				
				default:
					System.out.println("Invalid Option! Please enter a valid option..");;
			break;
			}
		}
		while (option !='E');
		System.out.println("Thank you for using services.......");
	}}

			

			
		
	
	

