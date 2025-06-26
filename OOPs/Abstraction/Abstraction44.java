package Abstraction;

import java.util.Scanner;

abstract class Abstraction44 //suppose this as bank 
{
	public String Name = "myBank";
	public String IFSC= "myBank123"; //these both are data members 
	
	public void bankDetail()
	{
		System.out.println("Bank_Name:"+Name+"Bank_IFSC Code:"+IFSC);
	}
	//Password 123
	abstract void Deposite();
	abstract void Withdraw();
	abstract void CheckBal();
}
abstract class BankService extends Abstraction44 {
	private double bal = 5000;
	private int pwd;
	public double money;
	
	public void Deposit() {
		System.out.println("Enter Password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123){
			System.out.println("Enter Deposit Amount:"+money);
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("Total Balance:"+bal);
		}
		else {
			System.out.println("Incorrect Password!!!");
		}
	}
	
	public void Withdraw() {
		System.out.println("Enter Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123) {
			System.out.println("Enter Withdraw Amount");
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("Withdrawn Money:"+money);
			System.out.println("Total Balance:"+bal);
		}
		else {
			System.out.println("Incorrect Password!!!");
		}
	}
	public void name() {
		
	}
}