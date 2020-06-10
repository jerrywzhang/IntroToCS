class Day2_3 {
	public static void main(String[] args) {
		int x = 10;
		while (x > 4) {
			System.out.println(x);
			System.out.println("x is greater than 4!");
			x--;
		}
		
		for (int y = 10; y > 4; y--) {
			System.out.println(y);
			System.out.println("y is greater than 4!");
		}
	
		int[] numberArray = {3, 4, 6, 2, 9};
		for (int i : numberArray) {
			System.out.println(i);
		} // The same thing can be done with a normal for loop. more will come in a later lesson.
	}
}