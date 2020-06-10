class Day2_4 {
	public static void main(String[] args) {
		int largeNum = 40000;
		System.out.println(largeNum);
		largeNum /= 30;
		System.out.println(largeNum);
		try {
			largeNum /= 0;
		} catch (ArithmeticException e) {
			System.out.println("Failed to divide");
			System.out.println(e);
		}
		System.out.println(largeNum);
		
		int largeNumAgain = 40000;
		System.out.println(largeNumAgain);
		int divideBy = 30;
		if (divideBy == 0) {
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		largeNumAgain /= divideBy;
		System.out.println(largeNumAgain);
		divideBy = 0;
		if (divideBy == 0) {
			throw new IllegalArgumentException("Cannot divide by 0");
			throw new ArithmeticException("Cannot divide by 0");
		}
		largeNumAgain /= divideBy;
		System.out.println(largeNumAgain);
		
		
		int[] numberArray = {3, 4, 6, 2, 9};
		for (int i = 0; i < 10; i++) { // replace 10 with 5
			System.out.println(i);
			System.out.println(numberArray[i]);
		}
	}
}