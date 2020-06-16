public class Car2 extends Vehicle {
	private String model;

	//constructor
	public Car2() {
		super();
		model = "";
	}

	//constructor
	public Car2(String name, String model, int age) {
		super(name, age);
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getRemainingLife() { // in years, implements getRemainingLife. if this isn't here, this must also be an abstract class
		return 15 - this.getAge();
	}
}