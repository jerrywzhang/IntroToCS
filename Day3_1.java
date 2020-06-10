class Day3_1 {
	public static void main(String[] args) {
		BankAccountA myAccount = new BankAccountA("password123", 5);
		System.out.println(myAccount.getBalance());
		myAccount.withdraw("password123", 3);
	}
}