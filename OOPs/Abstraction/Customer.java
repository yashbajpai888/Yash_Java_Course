//package Abstraction;
//
//import java.util.Scanner;
//
//// class Baank { this will give an error because here the keyword abstract is required.
//abstract class Bank 
//{ //here abstract keyword is neccessary otherwise it'll give an error msg 
//	String Name="myBank";
//	String IFSC = "myBank123";
//	
//	public void bankDetail() 
//	{
//		System.out.println("Bank Name:"+Name+"Bank_IFSC Code :"+IFSC);
//	}
//	//to use this services customer have password which, when entered then the services can
//	//be used.
//	//password == 1234
//	abstract void Deposite();
//	abstract void Withdraw();
//	abstract void checkBal();
//}
////class BankService extends Baank// here it will give an error so make it abstract class 
//class BankService extends Customer
//{
//		private double bal=5000;
//		private int pwd;
//		public double money;
//		
//		public void Deposite() 
//		{
//			System.out.println("Enter Password: ");
//			Scanner s=new Scanner(System.in);
//			pwd=s.nextInt();
//			
//			if(pwd==123) 
//			{
//				System.out.println("Enter Deposite Amount: ");
//				money=s.nextDouble();
//				bal=bal+money;
//				System.out.println("Deposit Money : "+money);
//				System.out.println("Total Balance :"+bal);
//			} 
//			else 
//			{
//				System.out.println("Incorrect Password !!!");
//			}
//		}
//		
//		public void Withdraw() 
//		{
//			System.out.println("Enter Password ");
//			Scanner s=new Scanner(System.in);
//			pwd=s.nextInt();
//			
//			if(pwd==123) 
//			{
//				System.out.println("Enter Withdraw Amount:");
//				money=s.nextDouble();
//				bal=bal-money;
//				System.out.println("Withdrawn Money :"+money);
//				System.out.println("Total Balance :"+bal);
//			}
//			else 
//			{
//				System.out.println("Incorrect Password !!!");
//			}
//		}
//		
//		public void checkBal() 
//		{
//			System.out.println("Enter Password");
//			Scanner s=new Scanner(System.in);
//			pwd=s.nextInt();
//			if(pwd==123) 
//			{
//				System.out.println("Total Balance"+bal);
//			}
//			else 
//			{
//				System.out.println("Incorrect Password !!!");
//			}
//		}
//}
//
//class Customer
//{
//	public static void main(String[] args) 
//	{
////		Customer b=new Customer();
//		BankService b=new BankService();
//		b.bankDetail();
//		
//		int ch;
//		System.out.println("1. Deposite :");
//		System.out.println("2. Withdraw :");
//		System.out.println("3. checkBalance :");
//		
//		System.out.println("\n Enter Your Choice: ");
//		Scanner s2=new Scanner(System.in);
//		ch=s2.nextInt();
//		
//		switch(ch) 
//		{
//			case 1: b.Deposite();
//			break;
//			case 2: b.Withdraw();
//			break;
//			case 3: b.checkBal();
//			break;
//		}	
//	}
//	}
//}
