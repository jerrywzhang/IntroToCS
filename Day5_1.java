class Day5_1 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 9;
		intArray[1] = 8;
		intArray[2] = 7;
		intArray[3] = 6;
		intArray[4] = 5;
		System.out.println(intArray); // prints out reference in memory
		System.out.println(intArray.length); // notice there are no parentheses after length
		
		int[] intArray2 = {9, 8, 7, 6, 5};
		System.out.println(intArray2);
		for (int value : intArray2) {
			System.out.println(value);
//			value++; // DOESNT DO ANYTHING
		}
		System.out.println("Finished printing");
		
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
			// dont have the following line at first
			intArray2[i] = intArray2[i] + 1;
		}
		System.out.println("Finished printing");
		
		for (int value : intArray2) {
			System.out.println(value);
		}
		System.out.println("Finished printing");
	}

}