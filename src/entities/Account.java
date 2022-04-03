package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	//Construtor com 2 argumentos
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	//Construtor com 3 argumentos
	//para no futuro nao precise alterar toda a variavel balace 
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	//Encapsulamento
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	//M�todo
	public void deposit(double amount) {
		balance += amount;
	}
			
	public void withdraw(double amount) {
		balance -= amount + 5.0;
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
