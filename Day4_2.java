class Day4_2 {
	public static void main(String[] args) {
		String password = "password123";
		BankAccountC myAccount = new BankAccountC(password, 5);
		System.out.println(myAccount.toString()); // show with and without overriding toString
		BankAccountC newAccount = new BankAccountC("securepassword", 5); // change to 5
		System.out.println(myAccount.equals(newAccount)); // show without overriding equals
	}

}