class Day3_2 {
	public static void main(String[] args) {
		BankAccountB myAccount = new BankAccountB("password123", 5);
		System.out.println(myAccount.getBalance());
		myAccount.withdraw("password123", 3);
		// cannot do myAccount.chargeFee();
		System.out.println(BankAccountB.getInterestRatePercent());
		// should not do myAccount.getInterestRatePercent();, but you technically can
	}
}