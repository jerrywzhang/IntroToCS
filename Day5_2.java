class Day5_2 {
	public static void main(String[] args) {
		int[] intArray = {9, 8, 7, 6, 5};
		System.out.println(intArray);
		for (int value : intArray) {
			System.out.println(value);
		}
		System.out.println("Finished printing");
		addOneArr(intArray);
		System.out.println("Added one");
		for (int value : intArray) {
			System.out.println(value);
		}
		
		int a = 5;
		addOneInt(5);
		System.out.println("printing a");
		System.out.println(a);
		
	}
	
	public static void addOneArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
	}
	
	public static void addOneInt(int val) {
		val++;
	}

}