class Day2_2 {
	public static void main(String[] args) {
		int x = 4; // make x 5 or 3
		if (x > 4) {
			System.out.println("x is greater than 4!");
		} else if (x < 4) {
			System.out.println("x is less than 4!");
		} else {
			System.out.println("x is 4!");
		}
		
		
		int y = 4;
		if (x == 4) {
			System.out.println("x is 4!");
		} else if (y == 4) {
			System.out.println("y is 4!");
		} else if (x == 4 && y == 4) {
			System.out.println("x and y are both 4!");
		} // swap these if statements around and see what happens
	
		
		// NESTED IF:
		if (x == 4 && y == 4) {
			System.out.println("x and y are both 4!");
		} // swap these if statements around and see what happens
	
		if (x == 4) {
			if (y == 4) {
				System.out.println("x and y are both 4!");
			}
		}
	
	}
}