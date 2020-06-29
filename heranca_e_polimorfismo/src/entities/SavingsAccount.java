package entities;

public class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance); //executa o construtor da superclasse Account
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance () {
		balance += balance * interestRate;
	}
	
	@Override //indica que � uma sobreposi��o
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}
