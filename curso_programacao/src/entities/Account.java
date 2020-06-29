package entities;

public class Account {
	private int number; //atributos privados só podem ser acessados através dos métodos get/set
	private String holder;
	private double balance;
	
	//construtor com 2 argumentos
	public Account(int number, String holder) { 
		
		this.number = number;
		this.holder = holder;
	}
	
	//construtor com 3 argumentos
	public Account(int number, String holder, double initialDeposit) {
	
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	//MÉTODOS GET E SET PARA ACESSAR ATRIBUTOS PRIVADOS

	public int getNumber() {
		return number;
	}
	//public void setNumber(int number) { - numero da conta nao pode ser alterado por isso não usamos metodo setNumber
	//	this.number = number;
	//}

	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}

	
	public double getBalance() {
		return balance;
	}
	//public void setBalance(double balance) { - saldo da conta tbm nao pode ser alterado sem ser através de depositos ou saques
	//	this.balance = balance;
	//}
	
	public void deposit (double amount) {
		balance += amount;
		
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5 ;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
