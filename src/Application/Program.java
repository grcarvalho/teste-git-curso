package Application;

import java.util.Scanner;

import Entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("There is a initial deposit? (Y/N) ");
		String answer = sc.nextLine();
		
		Account account = null;
		double deposit;
		if (answer.equals("Y") || answer.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			account = new Account(holder, accountNumber, deposit);
		} else {
			account = new Account(holder, accountNumber);
		}
		
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.println("Enter deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		System.out.println("Enter withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		sc.close();

	}

}
