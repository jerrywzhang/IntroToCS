class Day6_1 {
	public static void main(String[] args) {
		Car delorean = new Car("Back to the Future", "DeLorean", 2);
		System.out.println(delorean.getAge());
		System.out.println(delorean.getRemainingLife());
		
		EV tesla = new EV("Nikola", "Cybertruck", -2, 2);
		System.out.println(tesla.getAge());
		System.out.println(tesla.getMotors());
		System.out.println(tesla.getRemainingLife());
		
		Gas ford = new Gas("Bob", "F150", 2, "V6");
		System.out.println(ford.getAge());
		System.out.println(ford.getEngine());
		System.out.println(ford.getRemainingLife());
	}
}