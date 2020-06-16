class Day7_1 {
	public static void main(String[] args) {
		Car car = new EV();
		EV electric = new EV();
//		int x = car.getMotors(); //compile-time error
		int y = electric.getMotors(); //legal
		System.out.println(y);
		
		int x = ((EV) car).getMotors();
		System.out.println(x);
		
		int z = ((Gas) car).getAge(); // looks like it works. ClassCastException
		
	}
}
