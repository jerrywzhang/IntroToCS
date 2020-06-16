class Day4_4 {
	public static void main(String[] args) {
		int x = -5;
		x = Math.abs(x);
		
		System.out.println(Math.pow(4, 2));
		System.out.println(Math.pow(4.5, 2.1));
		
		System.out.println(Math.sqrt(25));
		System.out.println(Math.sqrt(2.54));

		System.out.println(Math.PI);
		
		double randNum = Math.random();
		System.out.println(randNum);
		randNum = randNum * 100; 
		System.out.println(randNum);
		int randInt = (int) randNum;
		System.out.println(randInt);
		
		// random integer from 1 to 100
		randNum = Math.random();
		System.out.println(randNum);
		randInt = (int) (randNum * 100) + 1;
		System.out.println(randInt);
	}

}