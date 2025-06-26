package Encapsulation;

import java.util.Scanner;

public class Bank {
	private double bal=5000;
	private int pass;
	
	void Deposit(double money)
	{
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pass = s.nextInt();
		if(pass == 1234) {
			bal = bal + money;
			System.out.println("dep money"+money);
			System.out.println("total balance"+bal);
		} else {
			System.out.println("Incorrect Password :");
		}
		
	}
	
	//withdraw
	void Withdraw(double money) {
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pass = s.nextInt();
		if(pass == 1234) {
			bal = bal - money;
			System.out.println("Withdraw money"+money);
			System.out.println("Total money:"+bal);
		} else {
			System.out.println("Incorrect Password :");
		}
	}
	
	//check bal
	void Checkbal() {
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pass=s.nextInt();
		if(pass == 1234) {
			System.out.print("Total Balance"+bal);
		}else {
			System.out.println("Incorrect Password");
		}
	}
	
	public static void main(String[] args) {		
		Bank b=new Bank();
		int ch;
		double amount;
		Scanner s2=new Scanner(System.in);
		 System.out.println("1. Deposit");
	     System.out.println("2. Withdraw");
	     System.out.println("3. Check Balance");

	     System.out.println("Enter Choice :");
	     ch =s2.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter amount to deposit:");
			amount = s2.nextDouble();
			b.Deposit(amount);
			break;
		case 2:
			System.out.println("Enter amount to withdraw");
			amount = s2.nextDouble();
			b.Withdraw(amount);
			break;
		case 3:
			b.Checkbal();
			break;
		default:
			System.out.println("Invalid Choice :");
		}
	}
}
