package HowTo;

import java.util.Scanner;

public class TakingUserInput {
	public static void main(String[] args) {
		int a,b,c;; //a and b will take input and c will perform operation & store.
		System.out.println("Enter an Input : ");
		
		//Creating an Scanner Class object
		Scanner s=new Scanner(System.in); //s is the name of scanner object.
		
		a=s.nextInt();
		b=s.nextInt();
		
		c=a+b;
		System.out.println(c);
		
		
	}
	
}
