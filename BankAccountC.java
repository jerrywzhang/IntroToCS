
public class BankAccountC {
	private String password; // for AP, these instance variables must be private
	private double balance;
	private static double interestRate = 0.03;
	private double withdrawalFee = 1;
	
	//constructors
	/** Default constructor. */
	public BankAccountC() {
		this.password = "password";
		this.balance = 0;
	}

	/** Constructs bank account with specified password and balance. */
	public BankAccountC(String acctPassword, double acctBalance) {
		this.password = acctPassword;
		this.balance = acctBalance;
		System.out.println("New account created with balance $" + this.balance);
	}
	
	// Accessor
	/** @return balance of this account */
	public double getBalance() {
		return this.balance;
	}
	
	// Mutators
	/** Deposits amount in bank account with given password.
	* @param acctPassword the password of this bank account
	* @param amount the amount to be deposited
	*/
	public void deposit(String acctPassword, double amount) { 
		if (acctPassword.equals(password)) {
			this.balance += amount;
			System.out.println("Your account balance is $" + this.balance);
		} else {
			System.out.println("Incorrect password");
		}
	}
	
	/** Withdraws amount from bank account with given password.
	* Assesses penalty if balance is less than amount.
	* @param acctPassword the password of this bank account
	* @param amount the amount to be withdrawn
	*/
	public void withdraw(String acctPassword, double amount) {
		if (acctPassword.equals(password)) {
			if (this.balance >= amount) {
				this.balance -= amount;
				chargeFee();
			} else {
				chargeFee();
				System.out.println("Insufficient funds");
			}
			System.out.println("Your account balance is $" + this.balance);
		} else {
			System.out.println("Incorrect password");
		}
	}
	
	public static double getInterestRatePercent() {
		return interestRate*100;
	}
	
	private void chargeFee() {
		this.balance -= withdrawalFee;
		if (this.balance < 0) {
			System.out.println("You must deposit money into your account, your balance is negative!");
		}
	}
	
	@Override
	public String toString() {
		return "This bank account has a balance of $" + this.balance + " and an interest rate of " + interestRate * 100 + "%.";
	}
	
	@Override
	public boolean equals(Object other) {
		// ClassCastException if other is not a BankAccountC
		return ((BankAccountC) other).getBalance() == this.balance;
	}
}
