 package classandobject;

import java.util.Scanner;

public class Student {
	
	int number ;
	String name;
	
	
	void getIp() {
		Scanner scan = new Scanner (System.in);
		System.out.println("number");
		number=scan.nextInt();
		System.out.println("Enter the Account Holder Name");
		String accountName = scan.nextLine();
		
		System.out.println();
		getAccountInformation(accountName);
	}
	void getAccountInformation(String name){
		//Account ac = new Account();
		//ac.getAccountDetails();
		//int accountNumber = accountNumber;
		System.out.println("the account details are below" + name);
	}
}
