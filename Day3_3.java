class Day3_3 {
	public static void main(String[] args) {
		String password = "password123";
		BankAccountB myAccount = new BankAccountB(password, 5);
		manageBankAccount(myAccount, password);
	}
	
	public static void manageBankAccount(BankAccountB acct, String password) {
		System.out.println(acct.getBalance());
		acct.withdraw(password, 3);
	}
}