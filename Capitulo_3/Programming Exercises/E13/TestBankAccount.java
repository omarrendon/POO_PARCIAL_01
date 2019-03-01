package cap03;

import java.util.Scanner;

public class TestBankAccount {
	private static Scanner scanner;
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		BankAccount acc3 = new BankAccount();
		BankAccount acc4 = new BankAccount();
		acc1 = getData();
		acc2 = getData();
		acc3 = getData();
		showValues(acc1);
		showValues(acc2);
		showValues(acc3);
		showValues(acc4);
	}
	public static BankAccount getData() {
		BankAccount acc = new BankAccount();
		scanner = new Scanner(System.in);
		System.out.println("Please input the number of account: ");
		acc.setAccNumber(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Please input the owner's name: ");
		acc.setOwnerName(scanner.nextLine());
		System.out.println("Please input the balance: ");
		acc.setBalance(scanner.nextDouble());
		return acc;
	}
	public static void showValues(BankAccount a) {
		System.out.println("Account Number: "+a.getAccNumber());
		System.out.println("Owner's Name: "+a.getOwnerName());
		System.out.println("Balance: "+a.getBalance());
		a.deductMonthlyFee();
		System.out.println("After monthly fee Balance: $"+a.getBalance());
		BankAccount.explainAccountPolicy();
		System.out.println("\n");
	}
}
