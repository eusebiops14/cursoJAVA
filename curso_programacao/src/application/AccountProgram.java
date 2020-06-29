package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class AccountProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account; //declara variavel accounnt como sendo do tipo Account
	
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		System.out.print("Is there an initial deposit (y/n): ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit); //instancia utilizando construtor de 3 argumentos
			
		}
		else {
			account = new Account(number, holder); //initialDeposit = 0 por padrao nessa construcao
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account.toString());
		
		//deposito na conta
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue); //realiza o deposito na conta
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		//saque na conta
		System.out.println();
		System.out.print("Enter a withraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue); //realiza o saque na conta
		System.out.print("Updated account data: ");
		System.out.println(account.toString());
		
		
		
		
		sc.close();
		
	}

}
