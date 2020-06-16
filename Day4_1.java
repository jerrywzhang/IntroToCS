class Day4_1 {
	public static void main(String[] args) {
		String empty = "";
		String fruit = "pineapple";
		String fruit2 = new String("pineapple");
		String food = new String("pizza");
		String sentence = fruit + " on " + food;
		System.out.println(sentence);
		
		System.out.println(fruit);
		System.out.println(fruit2);
		System.out.println(fruit == fruit2);
		System.out.println(fruit.equals(fruit2));
		System.out.println(fruit.compareTo(fruit2));
		System.out.println(fruit.compareTo(food));
//		System.out.println(fruit < fruit2);
		
		System.out.println(fruit.length());
		String computer = fruit.substring(4);
		System.out.println(computer); // apple
		System.out.println(fruit); // notice that fruit isn't modified
		
		String tree = fruit.substring(0, 4);
		System.out.println(tree); // pine
		
		System.out.println(fruit.substring(9)); // anything above 9 is StringIndexOutOfBoundsException
		
		System.out.println(fruit.indexOf("p"));
		System.out.println(fruit.indexOf("apple"));
		System.out.println(fruit.indexOf("z"));
		// NullPointerException if str is null
		
	}
}