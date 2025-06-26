package ZPrac;
import java.util.Scanner;

public class prac {
	int pass;
	double bal=5000;
	
	void Deposit(double money) {
		System.out.println("Enter Password");
		Scanner p=new Scanner(System.in);
		pass = p.nextInt();
		if(pass == 1234) {
			bal = bal+money;
			System.out.println("Deposited "+money);
			System.out.println("Total " +bal);
		}
		else {
			System.out.println("Wrong Password Try Again !!!");
		}

	}
	void Withdraw(double money) {
		System.out.println("Enter Password");
		Scanner p=new Scanner(System.in);
		pass = p.nextInt();
		if(pass == 1234) {
			bal = bal-money;
			System.out.println("Deposited "+money);
			System.out.println("Total " +bal);
		}else {
			System.out.println("Wrong Password Try Again !!!");
		}
	}
	void CheckBalance() {
		System.out.println("Enter Password");
		Scanner p=new Scanner(System.in);
		pass = p.nextInt();
		if(pass == 1234) {
			System.out.println("Total " +bal);
		}else {
			System.out.println("Wrong Password Try Again !!!");
		}
	}

	
	public static void main(String[] args) {
		prac r=new prac();
		double amount;
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		
		//choice
		System.out.println("Enter Your Choice :");
		Scanner inp=new Scanner(System.in);
		int ch=inp.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Enter Amount To Deposit");
			Scanner am=new Scanner(System.in);
			amount=am.nextInt();
			r.Deposit(amount);
			
			break;
		case 2:
			System.out.println("Enter Amount To Withdraw");
			Scanner an=new Scanner(System.in);
			amount=an.nextInt();
			r.Withdraw(amount);
			break;
		case 3:
			r.CheckBalance();
			break;
			
		default:
			System.out.println("Invalid !!!");
		
		}
	}
	
}
