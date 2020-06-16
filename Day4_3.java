class Day4_3 {
	public static void main(String[] args) {
		int a = 5;
		Integer wrappedA = new Integer(a);
		System.out.println(wrappedA);
		int newA = wrappedA.intValue();
		System.out.println(newA);
		
		String stringInt = "12345";
		System.out.println(stringInt);
		Integer newInt = Integer.parseInt(stringInt);
		System.out.println(newInt);
		int x = newInt.intValue();
		int y = x + a;
		System.out.println(y);
		
		double c = 2.54;
		// show the same thing with Double
	}

}