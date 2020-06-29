package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account(1001,"Alex",0.0); //objeto da superclasse Account
		BusinessAccount bacc = new BusinessAccount(1002,"Maria", 0.0, 500.0); //objeto da subclasse BussinesAccount
		
		//UPCASTING : de businessAccount para account
		Account acc1 = bacc; //objeto da subclasse atribuido a uma variavel da superclasse - n�o da erro pois businessAccount � uma Account
		Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
		Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);
		
		//DOWCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
			
			//BusinessAccount acc5 = (BusinessAccount)acc3; - vai dar erro ao executar. nao � possivel converter savingAccount para BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");  
		}
	}

}
