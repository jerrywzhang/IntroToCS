import java.util.Scanner;

class Day1_3 {
	public static void main(String[] args) {
		System.out.print("Hello");
		System.out.println(" World!");
		int x = 3;
		System.out.println(x);
		x++;
		System.out.println(x);
		
		System.out.println("\"This is a\n sentence\\\\phrase\\\"");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		double value = sc.nextDouble();
		System.out.println(value);
		value += 33;
		System.out.println(value);
		sc.close();
	}
}