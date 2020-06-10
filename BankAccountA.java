
public class BankAccountA {
	private String password;
	private double balance;
	//constructors
	/** Default constructor. */
	public BankAccountA() {
		this.password = "password";
		this.balance = 0;
	}

	/** Constructs bank account with specified password and balance. */
	public BankAccountA(String acctPassword, double acctBalance) {
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
			} else {
				System.out.println("Insufficient funds");
			}
			System.out.println("Your account balance is $" + this.balance);
		} else {
			System.out.println("Incorrect password");
		}
	}
}
