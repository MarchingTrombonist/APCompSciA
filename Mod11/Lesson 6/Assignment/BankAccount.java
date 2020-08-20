public class BankAccount {
	private String name;
	private double balance;

	public BankAccount(String n, double b) {
		name = n;
		balance = b;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double dp) {
		balance += dp;
	}

	public void withdraw(double wd) {
		balance -= wd;
	}

	public String toString() {
		return name + ": " + balance;
	}
}