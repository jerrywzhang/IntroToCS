class Day1_2 {
	public static void main(String[] args) {
		int x = 5; // x set to 5
		int y = 3 + 33; // y set to 36
		int z = 90 * 23 - 30 / 2; // z set to 2055
		z = y * x; // z reset to 180
		x = z % 2; // x reset to 0
		x += 2; // add two to x
		// x + 2 will NOT work
		x--; // subtract one from x
		x /= 3; // x set to 1
		boolean equals = (x == z); // equals set to false
		equals = x < z;
		equals = x > z;
		x = z; // x set to 180
		equals = (x >= z); // equals set to true
		
		boolean both = (x == z) && (y == 36); // both set to true
		both = !(y == 36); // both set to false
		both = (x == z) || (y == 35); // both set to true
		
		
		// CASTING
		int integerVal = 4;
		double doubleVal = 20.5;
		double newDouble = integerVal;
		int newInt = (int) doubleVal;
		
		System.out.println(newInt);
	}
}