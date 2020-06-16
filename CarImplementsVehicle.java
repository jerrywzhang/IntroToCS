public class CarImplementsVehicle implements VehicleInterface {
	
	private String name;
	private String model;
	private int age;

	//constructor
	public CarImplementsVehicle() {
		name = "";
		model = "";
		age = 0;
	}

	//constructor
	public CarImplementsVehicle(String name, String model, int age) {
		this.name = name; // to not use this, the param needs to be named something else
		this.model = model;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getAge() { // overridden
		return age;
	}
	
	public int getRemainingLife() { // in years, overridden
		return 15 - age;
	}
}