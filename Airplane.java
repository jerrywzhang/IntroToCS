public class Airplane extends Vehicle {
	private int passengers;

	//constructor
	public Airplane() {
		super();
		passengers = 0;
	}

	//constructor
	public Airplane(String name, int passengers, int age) {
		super(name, age);
		this.passengers = passengers;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public int getRemainingLife() { // in years, implements getRemainingLife. if this isn't here, this must also be an abstract class
		return 40 - this.getAge();
	}
}